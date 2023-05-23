package com.practice.EmployeeManagement.service;

import com.practice.EmployeeManagement.entity.Employee;
import com.practice.EmployeeManagement.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
       return  employeeRepository.save(employee);
    }

    public List<Employee> getEmployeeDetails(){
        return employeeRepository.findAll();
    }
}
