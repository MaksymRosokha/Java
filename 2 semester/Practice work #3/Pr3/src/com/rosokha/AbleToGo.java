package com.rosokha;

public interface AbleToGo {
    String sayHello = "Всім привіт";
    String sayBye = "Всім допобачення";

    String goToWork();
    String goHome();

    default String arrangeThings(){
        return "Розставляє свої речі";
    }

    default String collectThings(){
        return "Збирає свої речі";
    }
}
