package com.rosokha;

import com.rosokha.profession.*;
import com.rosokha.profession.programmers.*;
import com.rosokha.profession.teachers.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Programmer programmer = new Programmer("Максим", "Чоловік", 21, 40000);
        FrontEndProgrammer frontEndProgrammer = new FrontEndProgrammer("Ангеліна", "Жінка", 18, 27000);
        BackEndProgrammer backEndProgrammer = new BackEndProgrammer("Петро", "Чоловік", 24, 30000);
        Teacher teacher = new Teacher("Вікторія", "Жінка", 32, 12000);
        Mathematician mathematician = new Mathematician("Катерина", "Жінка", 38, 13500);
        Biologist biologist = new Biologist("Юрій", "Чоловік", 50, 11000);
        Physicist physicist = new Physicist("Олександр", "Чоловік", 45, 9000);
        Builder builder = new Builder("Владислав", "Чоловік", 35, 17000);
        PoliceOfficer policeOfficer = new PoliceOfficer("Микола", "Чоловік", 26, 19300);
        Trainer trainer = new Trainer("Андрій", "Чоловік", 18, 13500);

        startTheWorkingDay();
        goToWork(programmer, frontEndProgrammer, backEndProgrammer,
                teacher, mathematician, biologist, physicist, builder, policeOfficer, trainer);

        System.out.println("Меню");
        while (true) {
            int command = 0;

            System.out.print("1 - Вивести інформацію про всіх людей\n" +
                    "2 - Надати команду всім працювати\n" +
                    "3 - Надати команду всім відпочивати\n" +
                    "4 - Надати команду працювати програмістам\n" +
                    "5 - Надати команду працювати вчителям\n" +
                    "6 - Дізнатися кількість всіх людей\n" +
                    "7 - Дізнатися кількість всіх тренерів\n" +
                    "8 - Дізнатися кількість всіх поліцейських\n" +
                    "9 - Дізнатися кількість всіх будівельників\n" +
                    "10 - Дізнатися кількість всіх вчителів\n" +
                    "11 - Дізнатися кількість всіх програмістів\n" +
                    "12 - Підняти зарплату працівникам\n" +
                    "13 - Зробити перерву на каву\n" +
                    "14 - Закінчити робочий день\n" +
                    "15 - Вивести Hello World\n" +
                    "0 - Вихід\n" +
                    "Команда: ");
            try {
                command = Integer.parseInt(reader.readLine());
            } catch (Exception ex) {
                System.out.println("Помилка");
                continue;
            }

            switch (command) {
                case 1: {
                    getInformation(programmer, frontEndProgrammer, backEndProgrammer,
                            teacher, mathematician, biologist, physicist, builder, policeOfficer, trainer);
                    continue;
                }
                case 2: {
                    work(programmer, frontEndProgrammer, backEndProgrammer, teacher,
                            mathematician, biologist, physicist, builder, policeOfficer, trainer);
                    continue;
                }
                case 3: {
                    relax(programmer, frontEndProgrammer, backEndProgrammer, teacher,
                            mathematician, biologist, physicist, builder, policeOfficer, trainer);
                    continue;
                }
                case 4: {
                    work(programmer, frontEndProgrammer, backEndProgrammer);
                    continue;
                }
                case 5: {
                    work(teacher, mathematician, biologist, physicist);
                    continue;
                }
                case 6: {
                    System.out.println(Person.getCountPeople());
                    continue;
                }
                case 7: {
                    System.out.println(Trainer.getCountTrainers());
                    continue;
                }
                case 8: {
                    System.out.println(PoliceOfficer.getCountPoliceOfficers());
                    continue;
                }
                case 9: {
                    System.out.println(Builder.getCountBuilders());
                    continue;
                }
                case 10: {
                    System.out.println(Teacher.getCountTeachers());
                    continue;
                }
                case 11: {
                    System.out.println(Programmer.getCountProgrammers());
                    continue;
                }
                case 12: {
                    System.out.println("На скільки грн бажаєте підняти?");
                    try {
                        int salary = Integer.parseInt(reader.readLine());
                        programmer.setSalary(programmer.getSalary() + salary);
                        frontEndProgrammer.setSalary(frontEndProgrammer.getSalary() + salary);
                        backEndProgrammer.setSalary(backEndProgrammer.getSalary() + salary);
                        teacher.setSalary(teacher.getSalary() + salary);
                        mathematician.setSalary(mathematician.getSalary() + salary);
                        biologist.setSalary(biologist.getSalary() + salary);
                        physicist.setSalary(physicist.getSalary() + salary);
                        builder.setSalary(builder.getSalary() + salary);
                        policeOfficer.setSalary(policeOfficer.getSalary() + salary);
                        trainer.setSalary(trainer.getSalary() + salary);
                        System.out.println("Зарплата успішно піднята");
                    } catch (Exception ex) {}
                    continue;
                }
                case 13: {
                    Worker.timerForCoffeeBreak();
                    continue;
                }
                case 14: {
                    goHome(programmer, frontEndProgrammer, backEndProgrammer,
                            teacher, mathematician, biologist, physicist, builder, policeOfficer, trainer);

                    startTheWorkingDay();
                    goToWork(programmer, frontEndProgrammer, backEndProgrammer,
                            teacher, mathematician, biologist, physicist, builder, policeOfficer, trainer);
                    continue;
                }
                case 15: {
                    sayHelloWorld(programmer);
                    continue;
                }
                case 0: {
                    System.exit(0);
                }
                default: {
                    System.out.println("Помилка! Не правильно введена команда");
                    continue;
                }
            }
        }
    }

    public static void startTheWorkingDay() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int command;
        while (true) {
            System.out.println("Бажаєте почати робочий день?\n" +
                    "1 - Так\n" +
                    "0 - Ні");
            try {
                command = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Не правильно введена команда");
                continue;
            }

            switch (command){
                case 1:{
                    System.out.println("Вітаю з початком робочого дня");
                    return;
                }
                case 0:{
                    System.out.println("Допобачення");
                    System.exit(0);
                }
                default:{
                    System.out.println("Не правильно введена команда");
                    continue;
                }
            }
        }

    }

    public static void goToWork(AbleToGo... people) {
        for (AbleToGo person : people) {
            System.out.println(person.goToWork());
            System.out.println("\n");
        }
    }

    public static void goHome(AbleToGo... people) {
        for (AbleToGo person : people) {
            System.out.println(person.goHome());
            System.out.println("\n");
        }
    }

    public static void getInformation(Person... people) {
        for (Person person : people) {
            System.out.println(person.getInformationAboutPerson());
            System.out.println();
        }
    }

    public static void work(AbleToWork... workers) {
        for (AbleToWork worker : workers) {
            System.out.println(worker.work());
            System.out.println();
        }
    }

    public static void relax(AbleToWork... workers) {
        for (AbleToWork worker : workers) {
            System.out.println(worker.relax());
            System.out.println();
        }
    }

    public static void sayHelloWorld(AbleToWork... workers) {
        for (AbleToWork worker : workers) {
            System.out.println(worker.sayHelloWorld());
        }
    }
}