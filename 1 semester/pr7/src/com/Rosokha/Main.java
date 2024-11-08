package com.Rosokha;

import org.fusesource.jansi.AnsiConsole;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();

        int number;

        number = 50000;
        add(number);
        showResalts();
        contains(number);
        showResalts();
        remove(number);
        showResalts();

        number = 250000;
        add(number);
        showResalts();
        contains(number);
        showResalts();
        remove(number);
        showResalts();

        number = 500000;
        add(number);
        showResalts();
        contains(number);
        showResalts();
        remove(number);
        showResalts();

        number = 1000000;
        add(number);
        showResalts();
        contains(number);
        showResalts();
        remove(number);
        showResalts();
    }

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static LinkedList<Integer> linkedList = new LinkedList<>();
    private static HashSet<Integer> hashSet = new HashSet<>();
    private static TreeSet<Integer> treeSet = new TreeSet<>();
    private static LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
    private static HashMap<Integer, Integer> hashMap = new HashMap<>();
    private static LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    private static TreeMap<Integer, Integer> treeMap = new TreeMap<>();

    private static long startTime;
    private static long endTime;

    private static long arrayListTime;
    private static long linkedListTime;
    private static long hashSetTime;
    private static long treeSetTime;
    private static long linkedHashSetTime;
    private static long hashMapTime;
    private static long linkedHashMapTime;
    private static long treeMapTime;

    public static void add(int number) {
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT);
        if (number == 1000000) {
            System.out.println("Заповнення колекцій " + number + " об'єктів");
        } else {
            System.out.println("Заповнення колекцій " + number + " об'єктами");
        }


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            arrayList.add((int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        arrayListTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            linkedList.add((int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        linkedListTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            hashSet.add((int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        hashSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            treeSet.add((int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        treeSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            linkedHashSet.add((int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        linkedHashSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            hashMap.put(i, (int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        hashMapTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            linkedHashMap.put(i, (int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        linkedHashMapTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = 0; i < number; i++) {
            treeMap.put(i, (int) (Math.random() * 1000000));
        }
        endTime = System.currentTimeMillis();
        treeMapTime = (endTime - startTime);
    }

    public static void contains(int number) {
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT);
        System.out.println("Перевірка на наявність чилел у колекціях з " + number + " об'єктів ");


        startTime = System.currentTimeMillis();
        arrayList.contains(-1);
        endTime = System.currentTimeMillis();
        arrayListTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        linkedList.contains(-1);
        endTime = System.currentTimeMillis();
        linkedListTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        hashSet.contains(-1);
        endTime = System.currentTimeMillis();
        hashSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        treeSet.contains(-1);
        endTime = System.currentTimeMillis();
        treeSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        linkedHashSet.contains(-1);
        endTime = System.currentTimeMillis();
        linkedHashSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        hashMap.containsValue(-1);
        endTime = System.currentTimeMillis();
        hashMapTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        linkedHashMap.containsValue(-1);
        endTime = System.currentTimeMillis();
        linkedHashMapTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        treeMap.containsValue(-1);
        endTime = System.currentTimeMillis();
        treeMapTime = (endTime - startTime);
    }

    public static void remove(int number) {
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT);
        System.out.println("Видалення " + number + " об'єктів з колекцій");

        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        arrayListTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        linkedListTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            hashSet.remove(i);
        }
        endTime = System.currentTimeMillis();
        hashSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            treeSet.remove(i);
        }
        endTime = System.currentTimeMillis();
        treeSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            linkedHashSet.remove(i);
        }
        endTime = System.currentTimeMillis();
        linkedHashSetTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            hashMap.remove(i);
        }
        endTime = System.currentTimeMillis();
        hashMapTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            linkedHashMap.remove(i);
        }
        endTime = System.currentTimeMillis();
        linkedHashMapTime = (endTime - startTime);


        startTime = System.currentTimeMillis();
        for (int i = number - 1; i >= 0; i--) {
            treeMap.remove(i);
        }
        endTime = System.currentTimeMillis();
        treeMapTime = (endTime - startTime);
    }

    public static void showResalts() {

        long[] array = {arrayListTime, linkedListTime, hashSetTime, treeSetTime,
                linkedHashSetTime, hashMapTime, linkedHashMapTime, treeMapTime};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    long a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {

            if (i < 3) {
                System.out.print(ConsoleColors.GREEN_BOLD_BRIGHT);
            }
            if (i >= 3 && i < 6) {
                System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
            }
            if (i >= 6) {
                System.out.print(ConsoleColors.RED_BOLD_BRIGHT);
            }


            if (array[i] == arrayListTime) {
                System.out.println("arrayList = " + array[i] + "ms");
                arrayListTime = -1;
                continue;
            }
            if (array[i] == linkedListTime) {
                System.out.println("linkedList = " + array[i] + "ms");
                linkedListTime = -1;
                continue;
            }
            if (array[i] == hashSetTime) {
                System.out.println("hashSet = " + array[i] + "ms");
                hashSetTime = -1;
                continue;
            }
            if (array[i] == treeSetTime) {
                System.out.println("treeSet = " + array[i] + "ms");
                treeSetTime = -1;
                continue;
            }
            if (array[i] == linkedHashSetTime) {
                System.out.println("linkedHashSet = " + array[i] + "ms");
                linkedHashSetTime = -1;
                continue;
            }
            if (array[i] == hashMapTime) {
                System.out.println("hashMap = " + array[i] + "ms");
                hashMapTime = -1;
                continue;
            }
            if (array[i] == linkedHashMapTime) {
                System.out.println("linkedHashMap = " + array[i] + "ms");
                linkedHashMapTime = -1;
                continue;
            }
            if (array[i] == treeMapTime) {
                System.out.println("treeMap = " + array[i] + "ms");
                treeMapTime = -1;
                continue;
            }
        }

        System.out.println("\n");
    }
}