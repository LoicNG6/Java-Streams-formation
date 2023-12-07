package org.example;

import org.example.service.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        //First way to create a stream
        Employee[] arrayOfEmployees = {
                new Employee("Loco", 58080L),
                new Employee("CW", 25200L),
                new Employee("Mama", 27600L)
        };
        Stream.of(arrayOfEmployees);

        //second way
        List<Employee> listOfEmployees = Arrays.asList(arrayOfEmployees);
        listOfEmployees.stream();

        //third way
        Stream.Builder<Employee> employeeSB = Stream.builder();
        employeeSB.accept(arrayOfEmployees[0]);
        employeeSB.accept(arrayOfEmployees[1]);
        employeeSB.accept(arrayOfEmployees[2]);

        Stream<Employee> employeeStream = employeeSB.build();

        employeeStream.forEach(employee -> System.out.println(employee.toString()));
    }
}