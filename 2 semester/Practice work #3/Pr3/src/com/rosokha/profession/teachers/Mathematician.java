package com.rosokha.profession.teachers;

public final class Mathematician extends Teacher{
    public Mathematician (String name, String sex, int age, int salary) {
        super(name, sex, age, salary);
    }

    @Override
    public String work(){
        return super.getName() + " проводить урок математики";
    }
}
