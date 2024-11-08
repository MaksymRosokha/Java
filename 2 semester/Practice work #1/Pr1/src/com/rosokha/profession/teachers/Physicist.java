package com.rosokha.profession.teachers;

public final class Physicist extends Teacher{
    public Physicist (String name, String sex, int age, int salary) {
        super(name, sex, age, salary);
    }

    @Override
    public String work(){
        return super.getName() + " проводить урок фізики";
    }
}
