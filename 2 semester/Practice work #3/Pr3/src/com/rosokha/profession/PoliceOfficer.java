package com.rosokha.profession;
import com.rosokha.*;

public class PoliceOfficer extends Worker implements AbleToWork, AbleToGo{

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

    @Override
    public String goToWork() {
        return getName() + " приїхав на роботу\n" + sayHello + "\n" + arrangeThings();
    }

    @Override
    public String goHome() {
        return getName() + " збирається їхати додому\n" + collectThings() + "\n" + sayBye;
    }

    public static int getCountPoliceOfficers() {
        return countPoliceOfficers;
    }
}
