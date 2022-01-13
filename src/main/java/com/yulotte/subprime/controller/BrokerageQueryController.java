package com.yulotte.subprime.controller;

import com.yulotte.subprime.constants.ActionType;
import com.yulotte.subprime.policy.BrokeragePolicy;
import com.yulotte.subprime.policy.BrokeragePolicyFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yulotte
 *
 * 중계수수료가 얼마인지 조회하는 컨트롤러
 */
@RestController
public class BrokerageQueryController {


    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
        BrokeragePolicy policy = BrokeragePolicyFactory.getBrokeragePolicyBy(actionType);
        return policy.calculate(price);
    }
}
