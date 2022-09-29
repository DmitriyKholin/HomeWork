package com.example.homeworkcollections;

import java.util.Objects;

public class Employee {
    private String surname;
    private String name;

    public Employee(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(surname, employee.surname) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }
}
