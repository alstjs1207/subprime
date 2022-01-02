package com.yulotte.subprime.controller;

import com.yulotte.subprime.constants.ActionType;
import com.yulotte.subprime.policy.BrokeragePolicy;
import com.yulotte.subprime.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {


    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
        // TODO: action type 에 따라 계산하도록 수정
        BrokeragePolicy policy = BrokeragePolicyFactory.getBrokeragePolicyBy(actionType);
        return policy.calculate(price);
    }
}
