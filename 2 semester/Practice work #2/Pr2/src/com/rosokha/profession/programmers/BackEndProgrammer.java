package com.rosokha.profession.programmers;

public final class BackEndProgrammer extends Programmer {
    public BackEndProgrammer(String name, String sex, int age, int salary) {
        super(name, sex, age, salary);
    }

    @Override
    public String work() {
        return super.getName() + " пише код";
    }
}
