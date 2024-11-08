package com.rosokha.profession;

import com.rosokha.Worker;

public class Trainer extends Worker {

    private static int countTrainers;

    public Trainer(String name, String sex, int age, int salary){
        super(name, sex, age, salary);
        countTrainers++;
    }

    @Override
    public String getInformationAboutPerson() {
        return "Ім'я: " + super.getName() +
                "\nСтать: " + super.getSex() +
                "\nВік: " + super.getAge() +
                "\nЦя людина працює тренером, і отримує зарплату: " + super.getSalary() + " грн";
    }

    @Override
    public String work(){
        return super.getName() + " тренує учнів";
    }

    public static int getCountTrainers() {
        return countTrainers;
    }
}
