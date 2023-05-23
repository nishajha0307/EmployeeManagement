package com.practice.EmployeeManagement.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    public Map<String, String> getData() {
        return Map.of("name", "nisha");
    }

}
