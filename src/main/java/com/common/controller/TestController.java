package com.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yifeng.liu
 * @date 2019-11-06 09:36
 */
@RestController
public class TestController {

    @RequestMapping("/one")
    public String getTest(){

        return "hi";
    }
}
