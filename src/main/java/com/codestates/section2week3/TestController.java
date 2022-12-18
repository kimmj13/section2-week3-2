package com.codestates.section2week3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        return "test1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "test2";
    }

    @GetMapping("/test3")
    public String test3() {
        return "test3";
    }

    @GetMapping("/test4")
    public String test4() {
        return "test4";
    }

    @GetMapping("/test5")
    public String test5() {
        return "test5";
    }
}
