package com.mycode.designpatternsbehavioralmemento.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    private String name;
    private Integer salary;
    private String department;

    public Employee(EmployeeMemento snapshot) {
        this.name = snapshot.getName();
        this.salary = snapshot.getSalary();
        this.department = snapshot.getDepartment();
    }

    public EmployeeMemento takeSnapshot() {
        return new EmployeeMemento(this);
    }

    @Data
    public static class EmployeeMemento {
        private String name;
        private Integer salary;
        private String department;

        public EmployeeMemento(Employee employee) {
            this.name = employee.getName();
            this.salary = employee.getSalary();
            this.department = employee.getDepartment();
        }
    }

}
