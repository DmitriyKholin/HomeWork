package com.example.homeworkcollections.service;

import com.example.homeworkcollections.Employee;
import com.example.homeworkcollections.Exception.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    List<Employee> employees = new ArrayList<>();

    @Override
    public List<Employee> printAllEmployees() {
        return employees;
    }

    @Override
    public boolean completeEmployeesList() {
        employees.add(new Employee("Литвин", "Алексей"));
        employees.add(new Employee("Фанина", "Елена"));
        employees.add(new Employee("Жуков", "Андрей"));
        employees.add(new Employee("Зорина", "Римма"));
        employees.add(new Employee("Мартынов", "Петр"));
        employees.add(new Employee("Юрьевна", "Елизавета"));
        employees.add(new Employee("Арсеньев", ""));
        employees.add(new Employee("Петров", "Вадим"));
        return true;

    }
        @Override
        public boolean addEmployee (String surname, String name){
            Employee forAdd = new Employee(surname, name);
            if (employees.contains(forAdd)) {
                throw new EmployeeNotFoundException("Сотрудник уже есть!");
            }
            return employees.add(new Employee(surname, name));
        }


        @Override
        public Employee searchEmployee(String surname, String name){
            Employee forSearch=new Employee(surname,name);
            if (employees.contains(forSearch)){
                return forSearch;
            }
            throw new EmployeeNotFoundException("Сотрудник не найден!");
        }
    @Override
    public boolean removeEmployee(String surname, String name){
        Employee forRemove=new Employee(surname,name);
        if (employees.contains(forRemove)){
            return true;
        }
        throw new EmployeeNotFoundException("Сотрудник не найден!");
    }
    }

