package com.automaton.taskrunner.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {
    @GetMapping
    public String get() {
        return "Hello to the Test API";
    }
}
