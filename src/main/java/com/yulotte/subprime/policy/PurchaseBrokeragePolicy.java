package com.yulotte.subprime.policy;

/**
 *
 * 매매 일때 중계 수수료 계산
 */
public class PurchaseBrokeragePolicy {
    public Long calculate(Long price) {
        //TODO
        /**
         * 좋지 않다.
         * 생성과 계산을 같이 하고있다.
         */
        BrokerageRule rule;
        if (price < 50_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.6).limitAmount(250_000L).build();
        } else if(price < 200_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.5).limitAmount(800_000L).build();
        } else if(price < 600_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.4).limitAmount(null).build();
        } else if(price < 900_000_000) {
            rule = BrokerageRule.builder().brokeragePercent(0.5).limitAmount(null).build();
        } else {
            rule = BrokerageRule.builder().brokeragePercent(0.9).limitAmount(null).build();
        }
        return rule.calcMaxBrokerage(price);
    }
}
