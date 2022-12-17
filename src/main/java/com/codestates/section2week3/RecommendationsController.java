package com.codestates.section2week3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationsController {

    @GetMapping("/")
    public String helloTodo() {
        return "Hello~ To-do Application!!!!!!";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Bye~";
    }
}