package com.yulotte.subprime.policy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.lang.Nullable;

/**
 * 상한효율과 상한금액
 */
public class BrokerageRule {
    private Double brokeragePercent;

    @Nullable
    private Long limitAmount;

    public Long calcMaxBrokerage(Long price) {
        if (limitAmount == null) {
            return multiplyPercent(price);
        }
        return Math.min(multiplyPercent(price), limitAmount);
    };

    private Long multiplyPercent(Long price) {
        return Double.valueOf(Math.floor(price * (brokeragePercent / 100))).longValue();
    }

    @Builder
    BrokerageRule(Double brokeragePercent, Long limitAmount) {
        this.brokeragePercent = brokeragePercent;
        this.limitAmount = limitAmount;
    }
}
