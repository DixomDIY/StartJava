package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class GameHangman {

    private static final String[] WORDS = {"ПРОГРАММИРОВАНИЕ", "АЛГОРИТМ", "ФУНКЦИЯ", "ОБЪЕКТ", "ПЕРЕМЕННАЯ"};
    private static final int MAX_WRONG_GUESSES = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = WORDS[(int) (Math.random() * WORDS.length)];
        char[] guessedLetters = new char[word.length()];
        Arrays.fill(guessedLetters, '_');
        int wrongGuesses = 0;
        char[] wrongSymbols = {' '};

        printGallows(guessedLetters, wrongSymbols, wrongGuesses);

        game:
        while (wrongGuesses < MAX_WRONG_GUESSES && !isWordGuessed(guessedLetters)) {
            System.out.print("\nВведите букву: ");
            char guess = scanner.nextLine().toUpperCase().charAt(0);

            if (Character.UnicodeBlock.of(guess) != Character.UnicodeBlock.CYRILLIC) {
                System.out.println("Введите букву кириллицы.");
                continue;
            }

            for (char c : wrongSymbols) {
                if (c == guess) {
                    System.out.println("Буква " + guess + " не верная и уже использовалась");
                    continue game;
                }
            }

            for (char c : guessedLetters) {
                if (c == guess) {
                    System.out.println("Буква " + guess + " уже угадана, введите другую букву");
                    continue game;
                }
            }

            if (word.indexOf(guess) == -1) {
                wrongGuesses++;
                char[] temporary = wrongSymbols;
                wrongSymbols = new char[wrongSymbols.length + 1];
                System.arraycopy(temporary, 0, wrongSymbols, 0, temporary.length );
                wrongSymbols[temporary.length] = guess;
                System.out.println("Такой буквы нет, осталось попыток " + (MAX_WRONG_GUESSES - wrongGuesses));
            } else {
                if (wrongGuesses > 0) {
                    wrongGuesses--;
                }
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessedLetters[i] = guess;
                    }
                }
                System.out.println("Верно!");
            }

            printGallows(guessedLetters, wrongSymbols, wrongGuesses);
        }

        if (isWordGuessed(guessedLetters)) {
            System.out.println("Поздравляю, ты выиграл!");
        } else {
            System.out.println("Прости, ты проиграл. загаданное слово " + word + ".");
        }
    }

    private static void printGallows(char[] guessedLetters, char[] wrongSymbols, int wrongGuesses) {
        System.out.println();
        System.out.println("Слово загадка: " + Arrays.toString(guessedLetters).replace(",", "").
                replace(" ", ""));
        System.out.println("Не правильные ответы: " + wrongGuesses + " из " + MAX_WRONG_GUESSES);
        System.out.println();

        switch (wrongGuesses) {
            case 0:
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("      ");
                System.out.println("========");
                break;
            case 1:
                System.out.println("     +");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("========");
                break;
            case 2:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("========");
                break;
            case 3:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("     |");
                System.out.println("     |");
                System.out.println("========");
                break;
            case 4:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println(" |   |");
                System.out.println("     |");
                System.out.println("========");
                break;
            case 5:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|   |");
                System.out.println("     |");
                System.out.println("========");
                break;
            case 6:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("     |");
                System.out.println("========");
                break;
            case 7:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/    |");
                System.out.println("========");
                break;
            case 8:
                System.out.println(" +---+");
                System.out.println(" |   |");
                System.out.println(" O   |");
                System.out.println("/|\\  |");
                System.out.println("/ \\  |");
                System.out.println("========");
                break;
        }

        if (wrongSymbols.length > 1) {
            System.out.print("Не верные буквы:");
            for (char symbol : wrongSymbols) {
                System.out.print(symbol + " ");
            }
        }
    }

    private static boolean isWordGuessed(char[] guessedLetters) {
        for (char c : guessedLetters) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }
}
