package com.rosokha.profession.programmers;

import com.rosokha.Worker;

public class Programmer extends Worker {

    private static int countProgrammers;

    public Programmer(String name, String sex, int age, int salary) {
        super(name, sex, age, salary);
        countProgrammers++;
    }

    @Override
    public String getInformationAboutPerson() {
        return "Ім'я: " + super.getName() +
                "\nСтать: " + super.getSex() +
                "\nВік: " + super.getAge() +
                "\nЦя людина працює програмістом, і отримує зарплату: " + super.getSalary() + " грн";
    }

    @Override
    public String work(){
        return super.getName() + " програмує";
    }

    public static int getCountProgrammers() {
        return countProgrammers;
    }
}
