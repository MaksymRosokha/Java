package com.rosokha.profession.programmers;

import com.rosokha.AbleToGo;
import com.rosokha.AbleToWork;
import com.rosokha.Worker;

public class Programmer extends Worker implements AbleToWork, AbleToGo {

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

    @Override
    public String relax() {
        return super.getName() + " відпочиває після написання програми";
    }

    @Override
    public String goToWork() {
        return getName() + " приїхав на роботу\n" + sayHello + "\n" + arrangeThings();
    }

    @Override
    public String goHome() {
        return getName() + " збирається їхати додому\n" + collectThings() + "\n" + sayBye;
    }

    public static int getCountProgrammers() {
        return countProgrammers;
    }
}
