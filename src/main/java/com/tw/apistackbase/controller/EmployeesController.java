package com.tw.apistackbase.controller;

import com.tw.apistackbase.Repository.EmployeeRepository;
import com.tw.apistackbase.model.Employees;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class EmployeesController {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @GetMapping("/employees")
    public List<Employees> list (){
        return employeeRepository.findAll();
    }

}
