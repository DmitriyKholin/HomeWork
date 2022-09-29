package com.example.homeworkcollections.service;

import com.example.homeworkcollections.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> printAllEmployees();
    public boolean completeEmployeesList();
    public boolean addEmployee(String surname, String name);
    public boolean removeEmployee(String surname, String name);
    public Employee searchEmployee(String surname, String name);

}
