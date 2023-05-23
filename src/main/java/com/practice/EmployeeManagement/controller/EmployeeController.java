package com.practice.EmployeeManagement.controller;

import com.practice.EmployeeManagement.entity.Employee;
import com.practice.EmployeeManagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/home")
    public String home(){
        return "web development";
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
         return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @GetMapping("/getEmployees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getEmployeeDetails());
    }

}
