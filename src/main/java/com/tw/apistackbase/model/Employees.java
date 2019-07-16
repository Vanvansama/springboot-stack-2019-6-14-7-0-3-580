package com.tw.apistackbase.model;

import java.util.UUID;

public class Employees {
    private String id = UUID.randomUUID().toString();
    private String name;
    private int age;
    private String gender;

    public Employees() {
    }

    public Employees(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
