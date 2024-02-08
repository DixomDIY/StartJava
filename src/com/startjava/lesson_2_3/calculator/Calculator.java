package com.startjava.lesson_2_3.calculator;

public class Calculator {

    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    
}
    public void setSign(char sign) 
{        this.sign = sign;
    }

    public char getSign() {
        return sign;
    }

    public double calculate() {
        switch (sign) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    System.out.println("На 0 делить нельзя");
                    return 0;
                }
                return (double) a / b;
            case '^':
                double result = a;
                for (int i = 1; i < b; i++) {
                    result *= a;
                }
                return result;
            case '%':
                if (b == 0) {
                    System.out.println("На 0 делить нельзя");
                    return 0;
                }
                return a % b;
            default:
                System.out.println("Калькулятор не выполняет математические операции " + sign);
                return 0;
        }
    }
}