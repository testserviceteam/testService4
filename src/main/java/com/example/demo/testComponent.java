package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testComponent {

    @GetMapping("/")
    public String test4() {
        return "test4 is running. now test is completed? OK";
    }
}
