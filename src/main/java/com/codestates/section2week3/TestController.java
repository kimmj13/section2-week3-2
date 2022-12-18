package com.codestates.section2week3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String test1() {
        return "test1";
    }

    @GetMapping
    public String test2() {
        return "test2";
    }
}
