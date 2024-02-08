package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int counter = startSegment;
        do {
            if(counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumOddNumbers += counter;
            }
            counter++;
        } while (counter <= endSegment);
        System.out.println("В отрезке [" + startSegment + ", " + endSegment +
                "] сумма четных чисел = " + sumEvenNumbers + ", а нечетных = " + sumOddNumbers);

        //2. Вывод чисел в порядке убывания
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.printf("%3d", i);
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int sumDigits = 0;
        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit);
            sumDigits += digit;
            number /= 10;
        }
        System.out.println("\nСумма чисел = " + sumDigits);

        //4. Вывод чисел в несколько строк
        System.out.println("\n4. Вывод чисел в несколько строк");
        startSegment = 1;
        int endInterval = 24;
        counter = 0;
        for (int i = startSegment; i < endInterval; i++) {
            if (i % 2 != 0) {
                System.out.printf("%2d ", i);
                counter++;
                if (counter > 4) {
                    counter = 0;
                    System.out.println();
                }
            }
            if (i == endInterval - 1 && counter != 0) {
                for (int j = counter; j < 5; j++) {
                     System.out.printf("%2d ", 0);
                }
            }
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        int countTwos = 0;
        System.out.print("В " + number);
        while (number > 0) {
            if (number % 10 == 2) {
                countTwos++;
            }
            number /= 10;
        }
        String parityCheck = " ";
        if (countTwos % 2 != 0) {
            parityCheck = " не ";
        }
        System.out.println(parityCheck + "четное количество двоек - " + countTwos);

        //6. Отображение геометрических фигур
        System.out.println("\n6. Отображение геометрических фигур");
        int rows = 5;
        for(int i = 0; i < rows; i++) {
            System.out.println("**********");
        }
        System.out.println();

        counter = rows;
        while (counter != 0) {
            int column = 0;
            while (column < counter) {
                System.out.print("#");
                column++;
            }
            System.out.println();
            counter--;
        }
        System.out.println();

        int column = 0;
        do {
            int current = 0;
            if (counter < rows / 2 + 1) {
                column++;
            } else {
                column--;
            }
            do {
                System.out.print("$");
                current++;
            } while (current < column);
            counter++;
            System.out.println();
        } while (counter < rows);
 
        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-10s%-12s%-11s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");         
        for (char i = 15; i <= 'z'; i++) {
            if(i == 26) {
                i = 'a';
            }
            if (i % 2 != 0) {
                System.out.printf("%4d%11s            %-20s%n", (int) i, i, Character.getName(i));
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        int reverseNumber = 0;
        for (int i = number; i > 0; i /= 10) {
            reverseNumber = reverseNumber * 10 + i % 10;
        }
        String polindromCheck = " ";
        if (number != reverseNumber) {
            polindromCheck = " не ";
        }
        System.out.println("число " + number + polindromCheck + "является палиндромом");

        //9. Проверка, является ли число счастливым
        System.out.println("\n9. Проверка, является ли число счастливым");
        number = 225252; 
        int sumLuckyNumberA = 0;
        int sumLuckyNumberB = 0;
        counter = 0;
        for (int i = number; i > 0; i /= 10) {
            int digit = i % 10;
            if (counter > 2) {
                sumLuckyNumberA += digit;
            } else { 
                sumLuckyNumberB += digit;
            }
            counter++;
        }
        String checkingHappy = " ";
        if (sumLuckyNumberA != sumLuckyNumberB) {
            checkingHappy = " не ";
        }
        System.out.println("Число " + number + checkingHappy +
                "является счастливым Сумма цифр " + number / 1000 + " = " + sumLuckyNumberA +
                ", а сумма " + number % 1000 + " = " + sumLuckyNumberB );

        //10. Отображение таблицы умножения Пифагора
        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("    ТАБЛИЦА     ПИФАГОРА");
        for (int i = 1; i < 10; i++) {
            if (i == 2) {
                System.out.println("----+------------------------");
            }
            for (int j = 1; j < 10; j++) {
                if (j == 2) {
                     System.out.printf("%2s", "|");
                 }
                if (i * j != 1) {
                    System.out.printf("%3d", i * j);
                } else {
                    System.out.printf("%3s", "   ");
                }
            }
            System.out.println();
        }
    }
}