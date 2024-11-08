package com.rosokha.profession;
import com.rosokha.*;

public class Builder extends Worker {

    private static int countBuilders;

    public Builder(String name, String sex, int age, int salary){
        super(name, sex, age, salary);
        countBuilders++;
    }

    @Override
    public String getInformationAboutPerson() {
        return "Ім'я: " + super.getName() +
                "\nСтать: " + super.getSex() +
                "\nВік: " + super.getAge() +
                "\nЦя людина працює будівельником, і отримує зарплату: " + super.getSalary() + " грн";
    }

    @Override
    public String work(){
        return super.getName() + " будує дім";
    }

    public static int getCountBuilders() {
        return countBuilders;
    }
}
