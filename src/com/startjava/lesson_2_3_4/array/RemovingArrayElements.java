package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class RemovingArrayElements {

    public static void main(String[] args) {
        enterTask(-1);
        enterTask(15);
        enterTask(0);
        enterTask(14);
    }

    static void enterTask(int address) {
        int arraySize = 15;
        float[] numbers = generateRandomFloatArray(arraySize);
        deleteNumbers(numbers, address, arraySize);
    }

    static void deleteNumbers(float[] array, int address, int arraySize) {
        int deletedCount = 0;
        if (address < 0) {
            System.out.println("Адрес ячейки массива " + address + ", оно не может быть меньше 0");
        } else if (address >= array.length) {
            System.out.println("Адрес ячейки " + address + " за пределами массива, max = " + (array.length - 1));
        } else {
            System.out.printf("Значение ячейки переданного адреса %d = %.3f\n", address, array[address]);
            for (int i = address; i < arraySize; i ++){
                array[i] = 0;
                deletedCount++;
            }
            showArray(array);
        }
        System.out.println("Обнулено " + deletedCount + " ячеек ");
        System.out.println();
    }

    public static float[] generateRandomFloatArray(int arraySize) {
        Random random = new Random();
        float[] array = new float[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextFloat();
        }
        showArray(array);
        return array;
    }

    static void showArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
