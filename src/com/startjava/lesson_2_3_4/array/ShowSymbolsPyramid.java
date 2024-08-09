package com.startjava.lesson_2_3_4.array;

public class ShowSymbolsPyramid {

    public static void main(String[] args) {
        printPyramid('0', '9', true);
        printPyramid('/', '!', false);
        printPyramid('A', 'J', false);
    }

    public static void printPyramid(char start, char end, boolean isAscending) {
        int size = Math.abs(end - start) + 1;
        char[] chars = new char[size];

        if (start > end ) {
            for (int i = 0; i < chars.length; i++) {
                if (isAscending) {
                    chars[i] = (char) (end + i);
                } else {
                    chars[i] = (char) (start - i);
                }
            }
        } else {
            for (int i = 0; i < chars.length; i++) {
                if (isAscending){
                    chars[i] = (char) (end - i);
                } else {
                    chars[i] = (char) (start + i);
                }
            }
        }

        for (int i = 0; i < size; i++) {
            StringBuilder sb = new StringBuilder(" ".repeat(size - i - 1));
            for (int j = 0; j <= 2 * i; j++) {
                sb.append(chars[i]);
            }
            System.out.println(sb);
        }
    }
}


