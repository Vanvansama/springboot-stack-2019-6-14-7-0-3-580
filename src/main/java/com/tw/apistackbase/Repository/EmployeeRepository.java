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
        if (employeesList.stream().anyMatch(employees1 -> employees1.getId().equals(employees.getId()))){
            for (Employees employees1 : employeesList) {
                if (employees1.getId().equals(employees.getId())){
                    employeesList.remove(employees1);
                    employeesList.add(employees);
                    return employees;
                }
            }
        }
        else {
            employeesList.add(employees);
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
