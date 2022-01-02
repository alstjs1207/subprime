package com.yulotte.subprime.policy;

public interface BrokeragePolicy {
    BrokerageRule createBrokerageRule(Long price);

    default Long calculate(Long price) {
        BrokerageRule brokerageRule = createBrokerageRule(price);
        return brokerageRule.calcMaxBrokerage(price);
    }
}
