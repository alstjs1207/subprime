package com.yulotte.subprime.controller;

import com.yulotte.subprime.constants.ActionType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrokerageQueryController {

    @GetMapping("/api/calc/brokerage")
    public Long calcBrokerage(@RequestParam ActionType actionType, @RequestParam Long price) {
        //타입 정의 매매? 임대?
        // TODO: 중개 수수료 계산 로직
        return null;
    }
}
