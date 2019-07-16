package com.tw.apistackbase.controller;

import com.tw.apistackbase.Repository.EmployeeRepository;
import com.tw.apistackbase.model.Employees;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeesController {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @GetMapping("/employees")
    public List<Employees> list (){
        return employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employees add (@RequestParam Employees employees){
        return employeeRepository.add(employees);
    }

    @GetMapping("/employees/{employessId}")
    public Employees get (@PathVariable String employessId){
        return employeeRepository.get(employessId);
    }

    @DeleteMapping("/employees/{employessId}")
    public String delete(@PathVariable String employessId){
        return employeeRepository.delete(employessId);
    }

}
