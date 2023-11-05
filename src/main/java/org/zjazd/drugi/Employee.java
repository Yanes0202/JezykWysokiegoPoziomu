package org.zjazd.drugi;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Employee {
    private String name;
    private int salary;
    private boolean isMale;
}

class Staff {
    private List<Employee> employeeList = new ArrayList<>();

    void addEmployee(Employee employee) {
            if(employeeList.size() < 99) {
                employeeList.add(employee);
            } else {
                throw new ArrayIndexOutOfBoundsException("Za duża ilość pracowników");
            }
    }

    Double avgSalary() {
        if(!employeeList.isEmpty()) {
            return employeeList.stream().mapToInt(Employee::getSalary).average().getAsDouble();
        } else
            return null;
    }

    Double avgSalaryMale() {
        if (!employeeList.isEmpty()) {
            return employeeList.stream().filter(Employee::isMale).mapToInt(Employee::getSalary).average().getAsDouble();
        } else
            return null;
    }
}

class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Łukasz",10000, true);
        Employee employee2 = new Employee("Marlena",5000, false);
        Staff staff = new Staff();
        staff.addEmployee(employee1);
        staff.addEmployee(employee2);
        System.out.println(staff.avgSalary());
        System.out.println(staff.avgSalaryMale());
    }
}
