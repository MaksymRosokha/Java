package com.rosokha.profession.teachers;

import com.rosokha.AbleToGo;
import com.rosokha.AbleToWork;
import com.rosokha.Worker;

public class Teacher extends Worker implements AbleToWork, AbleToGo {

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

    @Override
    public String goToWork() {
        return getName() + " приїхав на роботу\n" + sayHello + "\n" + arrangeThings();
    }

    @Override
    public String goHome() {
        return getName() + " збирається їхати додому\n" + collectThings() + "\n" + sayBye;
    }

    public static int getCountTeachers() {
        return countTeachers;
    }
}
