package com.mycode.designpatternsbehavioralmemento.caretaker;

import com.mycode.designpatternsbehavioralmemento.entities.Employee;
import com.mycode.designpatternsbehavioralmemento.entities.Employee.EmployeeMemento;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class EmployeeCareTaker {
    private final Stack<EmployeeMemento> history;
    @Getter
    private Employee employee;

    public EmployeeCareTaker(Employee employee) {
        this.employee = employee;
        history = new Stack<>();
        history.add(employee.takeSnapshot());
    }

    public void editName(String name) {
        employee.setName(name);
        history.add(employee.takeSnapshot());
    }

    public void editSalary(int salary) {
        employee.setSalary(salary);
        history.add(employee.takeSnapshot());
    }

    public void editDepartment(String department) {
        employee.setDepartment(department);
        history.add(employee.takeSnapshot());
    }

    public void undo() {
        if (history.isEmpty())
            return;
        employee = new Employee(history.pop());
    }
}
