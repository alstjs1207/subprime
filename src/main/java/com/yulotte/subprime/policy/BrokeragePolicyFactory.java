package com.yulotte.subprime.policy;

import com.yulotte.subprime.constants.ActionType;

public class BrokeragePolicyFactory {

    public static BrokeragePolicy getBrokeragePolicyBy(ActionType type) {
        switch (type) {
            case PURCHASE:
                return new PurchaseBrokeragePolicy();
            case RENT:
                return new RentBrokeragePolicy();
            default:
                throw new IllegalArgumentException();
        }
    }
}
