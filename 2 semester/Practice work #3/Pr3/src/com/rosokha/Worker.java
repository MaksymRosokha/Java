package com.rosokha;

public abstract class Worker extends Person {

    private int salary;

    public Worker(String name, String sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    public static void timerForCoffeeBreak(){
        System.out.println();
        System.out.println(AbleToWork.startCoffeeBreak);
        for(int i = 9; i >= 0; i--){
            for(int j = 59; j >= 0; j--){
                System.out.println(i + ":" + j);
            }
        }
        System.out.println(AbleToWork.endCoffeeBreak);
        System.out.println();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
