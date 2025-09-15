package com.example.springboot_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/demo/data")
    public String getData() {
        return "First message from AWS ECS";
    }
}