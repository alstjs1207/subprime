package com.yulotte.subprime.policy;

public class RentBrokeragePolicy implements BrokeragePolicy {
    @Override
    public BrokerageRule createBrokerageRule(Long price) {
        BrokerageRule rule;
        if (price < 50_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.5).limitAmount(200_000L).build();
        } else if (price < 100_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.4).limitAmount(300_000L).build();
        } else if (price < 300_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.3).limitAmount(null).build();
        } else if (price < 600_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.4).limitAmount(null).build();
        } else {
            rule = BrokerageRule.builder().brokeragePercent(0.8).limitAmount(null).build();
        }
        return rule;
    }
}
