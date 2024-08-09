package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class UniqueNumbers {

    public static void main(String[] args) {
        generateNumbers(-10, 20, 23);
        generateNumbers(-30, 10, 10);
        generateNumbers(34, -34, 0);
        generateNumbers(-1, 2, -3);
    }

    public static void generateNumbers(int start, int end, int numInLine) {
        if (numInLine < 1) {
            System.out.println("Ошибка: количество чисел в строке не может быть меньше 1 " + numInLine);
            return;
        }

        int length = Math.abs(end - start);
        int arraySize = (int) (length * 0.75);
        System.out.println("Размер массива 75% от длины = " + arraySize);
        if (arraySize < 1) {
            System.out.println("Ошибка: длина массива должна быть больше 0 (" + arraySize + ")");
            return;
        }

        int[] uniqueNumbers = new int[arraySize];
        System.out.println("Случайные уникальные чила в границе. От " + start + " до " + end);
        for (int i = 0; i < uniqueNumbers.length; i++) {
           int numeber = end;
           while (isNumberUsed(uniqueNumbers, numeber)) {
               numeber = (int)  (Math.random() * length) + start;
           }
            uniqueNumbers[i] = numeber;
           System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();

        Arrays.sort(uniqueNumbers);
        System.out.println("Отсортированный массив" );
        for (int i = 0; i < uniqueNumbers.length; i++ ) {
            if (i == numInLine) {
                System.out.println();
                numInLine = numInLine * 2;
            }
            System.out.print(uniqueNumbers[i] + " ");
        }
        System.out.println();
    }

    private static boolean isNumberUsed(int[] array, int number) {
        for (int j : array) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }
}