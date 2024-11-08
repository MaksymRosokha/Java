package com.rosokha;

public abstract class Worker extends Person {

    private int salary;

    public Worker(String name, String sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    public abstract String work();

    public abstract String relax();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
