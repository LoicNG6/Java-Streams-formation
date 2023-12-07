package org.example.service;

import java.util.Random;
import java.util.stream.LongStream;

public class Employee {
    private Long id;
    private final String name;
    private Long wage;

    private Random rd = new Random();

    public Employee(String name, Long wage) {
        this.name = name;
        this.wage = wage;
        this.id = this.rd.nextLong();
    }

    @Override
    public String toString() {
        return "Id = " + this.id
                + "\n" + "Name = " + this.name
                + "\n" + "Wage = " + this.wage;
    }
}
