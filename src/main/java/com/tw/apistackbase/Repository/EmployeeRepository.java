package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    static List<Employees> employeesList = new ArrayList<>();
    static {
        employeesList.add(new Employees("1234567","stefan",22,"male"));
        employeesList.add(new Employees("xcgtntn","eddy",22,"male"));
        employeesList.add(new Employees("1sggfsf","young",22,"male"));
    }

    public List<Employees> findAll() {
        return employeesList;
    }
}
