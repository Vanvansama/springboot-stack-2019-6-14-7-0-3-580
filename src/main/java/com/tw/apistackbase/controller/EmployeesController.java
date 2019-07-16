package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employees;
import com.tw.apistackbase.service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class EmployeesController {

    @Autowired
    private EmployeeServiceInterface employeeServiceInterface;

    @GetMapping("/employees")
    public List<Employees> list (){
        return employeeServiceInterface.findAll();
    }

    @PostMapping("/employees")
    public Employees add (@RequestBody Employees employees){
        return employeeServiceInterface.add(employees);
    }

    @GetMapping("/employees/{employessId}")
    public Employees get (@PathVariable String employessId){
        return employeeServiceInterface.get(employessId);
    }

    @DeleteMapping("/employees/{employessId}")
    public String delete(@PathVariable String employessId){
        return employeeServiceInterface.delete(employessId);
    }


}
