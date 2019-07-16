package com.tw.apistackbase.service;

import com.tw.apistackbase.Repository.EmployeeRepository;
import com.tw.apistackbase.model.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employees add(Employees employees) {
        return employeeRepository.add(employees);
    }

    @Override
    public Employees get(String employessId) {
        return employeeRepository.get(employessId);
    }

    @Override
    public String delete(String employessId) {
        return employeeRepository.delete(employessId);
    }
}
