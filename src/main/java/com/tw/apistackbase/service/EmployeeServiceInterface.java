package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Employees;

import java.util.List;

public interface EmployeeServiceInterface {
    List<Employees> findAll();

    Employees add(Employees employees);

    Employees get(String employessId);

    String delete(String employessId);
}
