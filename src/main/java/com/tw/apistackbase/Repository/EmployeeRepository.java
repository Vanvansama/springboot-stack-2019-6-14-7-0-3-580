package com.tw.apistackbase.Repository;

import com.tw.apistackbase.model.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    static List<Employees> employeesList = new ArrayList<>();
    static {
        employeesList.add(new Employees("stefan",22,"male"));
        employeesList.add(new Employees("eddy",22,"male"));
        employeesList.add(new Employees("young",22,"male"));
    }

    public List<Employees> findAll() {
        return employeesList;
    }

    public Employees add(Employees employees) {
        if (employeesList.add(employees)){
            return employees;
        }
        return null;
    }

    public Employees get(String employessId) {
        return employeesList.stream().filter(employees -> employees.getId().equals(employessId)).findAny().orElse(null);
    }

    public String delete(String employessId) {
        employeesList.remove(
                employeesList.stream()
                        .filter(employees -> employees.getId().equals(employessId))
                        .findAny()
                        .orElse(null)
        );
        return "success";
    }
}
