package com.rosokha.profession.programmers;

public final class FrontEndProgrammer extends Programmer {
    public FrontEndProgrammer(String name, String sex, int age, int salary) {
        super(name, sex, age, salary);
    }

    @Override
    public String work(){
        return super.getName() + " створює дизайн сайту";
    }
}
