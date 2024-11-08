package com.rosokha.profession;

import com.rosokha.AbleToGo;
import com.rosokha.AbleToWork;
import com.rosokha.Worker;

public class Trainer extends Worker implements AbleToWork, AbleToGo {

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

    @Override
    public String relax() {
        return super.getName() + " відпочиває після тренування";
    }

    @Override
    public String goToWork() {
        return getName() + " приїхав на роботу\n" + sayHello + "\n" + arrangeThings();
    }

    @Override
    public String goHome() {
        return getName() + " збирається їхати додому\n" + collectThings() + "\n" + sayBye;
    }

    public static int getCountTrainers() {
        return countTrainers;
    }
}
