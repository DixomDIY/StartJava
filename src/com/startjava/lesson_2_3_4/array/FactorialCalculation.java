package com.startjava.lesson_2_3_4.array;

public class FactorialCalculation {

    public static void main(String[] args) {
        calculateAndShow();
        calculateAndShow(null);
        calculateAndShow(8, 0, 9);
        calculateAndShow(-3, 1, 7, 13);
        calculateAndShow(-22, -0);
    }

    public static void calculateAndShow(Integer... numbers) {
        if (numbers == null) {
            System.out.println("Ошибка: массив null");
            return;
        }

        if (numbers.length < 1) {
            System.out.println("Ошибка: массив пуст");
            return;
        }

        long[] results = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            results[i] = calculate(numbers[i]);
            String factorialString = numbers[i] >= 0 ? show(numbers[i], results[i])
                    : String.format("Ошибка: факториал %d! не определен", numbers[i]);
            System.out.println(factorialString);
       }
    }

    private static long calculate(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private static String show(int number, long factorial) {
        StringBuilder format = new StringBuilder(number + "! = ");
        for (int i = 1; i <= number; i++) {
            format.append(i);
            if (i < number) {
                format.append(" * ");
            }
        }
        if (number > 1) {
            format.append(" = ").append(factorial);
        } else if (number == 0) {
            format.append(1);
        }
        return format.toString();
    }
}
