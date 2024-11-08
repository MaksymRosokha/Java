package com.rosokha.profession.teachers;

import com.rosokha.Worker;

public class Teacher extends Worker {

    private static int countTeachers;

    public Teacher (String name, String sex, int age, int salary) {
        super(name, sex, age, salary);
        countTeachers++;
    }

    @Override
    public String getInformationAboutPerson() {
        return "Ім'я: " + super.getName() +
                "\nСтать: " + super.getSex() +
                "\nВік: " + super.getAge() +
                "\nЦя людина працює вчителем, і отримує зарплату: " + super.getSalary() + " грн";
    }

    @Override
    public String work(){
        return super.getName() + " проводить урок";
    }

    @Override
    public String relax() {
        return super.getName() + " відпочиває після уроків";
    }

    public static int getCountTeachers() {
        return countTeachers;
    }
}
