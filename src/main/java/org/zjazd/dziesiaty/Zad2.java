package org.zjazd.dziesiaty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Zad2 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i<10; i++) {
            employees.add(Employee.builder().id(i).idDep(i%2).salary(i*10000).build());
        }
        Staff staff = new Staff(employees);

        employees.forEach(employee -> {
            System.out.println();
            System.out.print("id działu: " + employee.idDep);
            System.out.print("płaca: " + employee.salary);
        });

        System.out.println();
        System.out.println("średnia: " + staff.avgDep(1));
    }
}


@Getter
@Builder
class Employee {
    int id, idDep, salary;
}

@AllArgsConstructor
class Staff {
    List<Employee> employees;

    public Double avgDep(int idDep) {
        return employees.stream().filter(employee -> employee.idDep == idDep).mapToInt(Employee::getSalary).average().getAsDouble();
    }
}