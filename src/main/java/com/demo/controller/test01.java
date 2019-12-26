package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test01")
public class test01 {

    @GetMapping(value = "/test01")
    public String getAIReviewList(@RequestParam String name) {
        return "请求成功="+name;
    }

}
