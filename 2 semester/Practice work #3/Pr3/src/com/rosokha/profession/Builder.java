package com.rosokha.profession;
import com.rosokha.*;

public class Builder extends Worker implements AbleToWork, AbleToGo{

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

    @Override
    public String relax() {
        return super.getName() + " відпочиває після того, як побудував дім";
    }

    @Override
    public String goToWork() {
        return getName() + " приїхав на роботу\n" + sayHello + "\n" + arrangeThings();
    }

    @Override
    public String goHome() {
        return getName() + " збирається їхати додому\n" + collectThings() + "\n" + sayBye;
    }

    public static int getCountBuilders() {
        return countBuilders;
    }
}
