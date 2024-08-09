package com.startjava.lesson_2_3_4.person;

public class Person {
    
    String gender = "мужской";
    String name = "Александр";
    double height = 160;
    double weight = 65.5;
    int age = 35;

    void go() {
        System.out.println(name + " идёт");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void speak() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " учит Java");
    }
}