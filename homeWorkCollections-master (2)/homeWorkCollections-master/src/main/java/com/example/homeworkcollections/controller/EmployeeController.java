package com.example.homeworkcollections.controller;

import com.example.homeworkcollections.Employee;
import com.example.homeworkcollections.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private  final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/complete")
    public boolean completeEmployeesList(){
        return employeeService.completeEmployeesList();
    }

    @GetMapping("/printAllEmployees")
    public List<Employee> printAllEmployees(){
        return employeeService.printAllEmployees();
    }

    @GetMapping("/add")
    public boolean addEmployee(@RequestParam String surname, @RequestParam String name){
        return employeeService.addEmployee(surname, name);
    }

    @GetMapping("/remove")
    public boolean removeEmployee(@RequestParam String surname, @RequestParam String name){
        return employeeService.removeEmployee(surname, name);

    }

    @GetMapping("/search")
    public Employee searchEmployee(@RequestParam String surname, @RequestParam String name){
        return employeeService.searchEmployee(surname, name);
    }


}
