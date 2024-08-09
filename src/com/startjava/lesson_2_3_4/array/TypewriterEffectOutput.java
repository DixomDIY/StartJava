package com.startjava.lesson_2_3_4.array;

public class TypewriterEffectOutput {

    static String shortWord = " ";
    static String longWord = " ";

    public static void main(String[] args) {
        typewriter("Java - это C++, из которого убрали все пистолеты, ножи и дубинки.\n" + "- James Gosling");
        typewriter("Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его.\n" + "- Robert Martin");
        typewriter(null);
        typewriter("");

        System.out.println("Самое короткое слово: " + shortWord);
        System.out.println("Самое длинное слово: " + longWord);
    }

    static void typewriter(String text) {
        if (text == null) {
            System.out.println("Входные данных null");
            return;
        }

        if (text.isBlank()) {
            System.out.println("Пустая строка");
            return;
        }

        findShortAndLongWords(text);
        printTypewriterText(text);
    }

    public static void printTypewriterText(String text) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // Переход на новую строку
    }

    public static void findShortAndLongWords(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я\\s]", " ").split("\\s+");
        for (String word : words) {
            if (word.length() <= shortWord.length()) {
                shortWord = word;
            }
            if (word.length() > longWord.length()) {
                longWord = word;
            }
        }
    }
}
