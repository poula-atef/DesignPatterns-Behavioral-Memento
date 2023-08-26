package com.mycode.designpatternsbehavioralmemento;

import com.mycode.designpatternsbehavioralmemento.entities.caretaker.EmployeeCareTaker;
import com.mycode.designpatternsbehavioralmemento.entities.Employee;

public class DesignPatternsBehavioralMementoApplication {

    public static void main(String[] args) {
        Employee employee = new Employee("poula", 4500, "Development");
        EmployeeCareTaker careTaker = new EmployeeCareTaker(employee);
        System.out.println("Original Employee Data Is :: " + careTaker.getEmployee());

        careTaker.editName("atef");
        System.out.println("After Change Name :: " + careTaker.getEmployee());

        careTaker.editSalary(7000);
        System.out.println("After Change Salary :: " + careTaker.getEmployee());

        careTaker.editDepartment("IT");
        System.out.println("After Change Department :: " + careTaker.getEmployee());

        careTaker.undo();
        System.out.println("After First Undo :: " + careTaker.getEmployee());

        careTaker.undo();
        System.out.println("After Second Undo :: " + careTaker.getEmployee());

        careTaker.undo();
        System.out.println("After Third Undo :: " + careTaker.getEmployee());
    }

}
