package com.rosokha;

public class Person {
    private String name;
    private String sex;
    private int age;
    private static int countPeople;

    public Person(){

    }

    public Person(String name, String sex, int age) {
        setName(name);
        setSex(sex);
        setAge(age);
        countPeople++;
    }

    public String getInformationAboutPerson() {
        return "Ім'я: " + name +
                "\nСтать: " + sex +
                "\nВік: " + age;
    }

    public static int getCountPeople() {
        return countPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Людині не може бути від'ємна кількість років");
        }
    }
}
