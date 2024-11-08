package com.rosokha.profession;
import com.rosokha.*;

public class PoliceOfficer extends Worker {

    private static int countPoliceOfficers;

    public PoliceOfficer(String name, String sex, int age, int salary){
        super(name, sex, age, salary);
        countPoliceOfficers++;
    }

    @Override
    public String getInformationAboutPerson() {
        return "Ім'я: " + super.getName() +
                "\nСтать: " + super.getSex() +
                "\nВік: " + super.getAge() +
                "\nЦя людина працює поліцейським, і отримує зарплату: " + super.getSalary() + " грн";
    }

    @Override
    public String work(){
        return super.getName() + " ловить злочинців";
    }

    @Override
    public String relax() {
        return super.getName() + " відпочиває після того, як виписав штраф";
    }

    public static int getCountPoliceOfficers() {
        return countPoliceOfficers;
    }
}
