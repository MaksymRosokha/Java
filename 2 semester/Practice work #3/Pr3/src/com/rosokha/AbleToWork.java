package com.rosokha;

public interface AbleToWork {

    String startCoffeeBreak = "Зараз триває 10-ти хвилинна перерва на каву";
    String endCoffeeBreak = "Перерва на каву закінчилася";

    String work();
    String relax();

    default String sayHelloWorld(){
        return "Hello World!";
    }
}
