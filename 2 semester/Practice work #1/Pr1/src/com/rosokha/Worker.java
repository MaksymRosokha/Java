package com.rosokha;

public class Worker extends Person {

    private int salary;
    private static int countWorkers;

    public Worker(String name, String sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
        countWorkers++;
    }

    @Override
    public String getInformationAboutPerson() {
        return "Ім'я: " + super.getName() +
                "\nСтать: " + super.getSex() +
                "\nВік: " + super.getAge() +
                "\nЦя людина десь працює, і отримує зарплату: " + salary + " грн";
    }

    public static int getCountWorkers() {
        return countWorkers;
    }

    public String work() {
        return super.getName() + " працює";
    }

    public String relax() {
        return super.getName() + " віддихає";
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
