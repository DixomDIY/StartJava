package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String answer = "yes";
        while (answer.equals("yes")) {
            Calculator calc = new Calculator();
            System.out.print("Введите первое число: ");
            calc.setA(scaner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scaner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(scaner.nextInt());
            System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() +
                    " = " + calc.calculate());
            scaner.nextLine();
           
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                answer = scaner.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}