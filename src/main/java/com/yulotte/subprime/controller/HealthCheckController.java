package com.yulotte.subprime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yulotte
 */
@RestController
public class HealthCheckController {

    @GetMapping("api/ping")
    public String ping() {
        return "ping-ok";
    }
}
