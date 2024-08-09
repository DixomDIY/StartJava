package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class CharTriangle {

     public static void main(String[] args) {
         showDynamicArray(new int[]{});
         showDynamicArray(null);
         showDynamicArray(new int[]{6, 8, 9, 1});
         showDynamicArray(new int[]{13, 8, 5, 3, 2, 1, 1});
    }

    private static void showDynamicArray(int[] array) {
         if (array == null) {
             System.out.println("Массив null");
             return;
         }

         if (array.length < 1) {
             System.out.println("Массив пуст");
             return;
         }

         System.out.println("   До реверса: " + Arrays.toString(array));
         System.out.println("После реверса: " + Arrays.toString(getReversArray(array)));
    }

    private static int[] getReversArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}
