public class CyclesTheme {
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int pointer = startSegment;
        do {
            if(pointer % 2 == 0) {
                sumEvenNumbers += pointer;
            } else {
                sumOddNumbers += pointer;
            }
            pointer++;
        } while (pointer <= endSegment);
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
        for (int i = max-1; i > min; i--) {
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
        pointer = 0;
        for (int i = startSegment; i < endInterval; i++) {
            if (i % 2 != 0){
                System.out.printf("%2d ", i);
                pointer++;
                if (pointer > 4 ){
                    pointer = 0;
                    System.out.println();
                }
            }
            if (i == endInterval - 1 && pointer != 0) {
                for (int j = pointer; j < 5; j++){
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

        int row = rows;
        while (row != 0) {
            int column = 0;
            while (column < row) {
                System.out.print("#");
                column++;
            }
            System.out.println();
            row--;
        }
        System.out.println();

        int column = 0;
        do {
            int current = 0;
            if (row < rows / 2 + 1) {
                column++;
            } else {
                column--;
            }
            do {
                System.out.print("$");
                current++;
            } while (current < column);
            row++;
            System.out.println();
        } while (row < rows);
 
        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-7s   %-9s   %-11s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 0; i < 6; i++) {
            char symbol = (char) (15 + i * 2);
            System.out.printf("%4d          %1s            %-20s  %n",
                    (int) symbol, symbol, Character.getName(symbol));
        }
        for (int i = 0; i < 13; i++) {
            char symbol = (char) (98 + i * 2);
            System.out.printf("%4d          %1s            %-20s  %n",
                    (int) symbol, symbol, Character.getName(symbol));
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        int reversNumber = 0;
        for (int i = number; i > 0; i /= 10 ) {
            reversNumber = reversNumber * 10 + i % 10;
        }
        String polindromCheck = " ";
        if (number != reversNumber) {
            polindromCheck = " не ";
        }
        System.out.println("число " + number + polindromCheck + "является палиндромом");

        //9. Проверка, является ли число счастливым
        System.out.println("\n9. Проверка, является ли число счастливым");
        number = 225252;
        int luckyNumberA = 0;
        int luckyNumberB = 0;
        int counter = 0;
        for (int i = number; i > 0; i /= 10 ) {
            if (counter > 2) {
                luckyNumberA = luckyNumberA + i % 10;
            } else {
                luckyNumberB = luckyNumberB + i % 10;
            }
            counter++;
        }
        String checkingHappy = " ";
        if (luckyNumberA != luckyNumberB) {
            checkingHappy = " не ";
        }
        System.out.println("Число " + number + checkingHappy +
                "является счастливым Сумма цифр ABC = " + luckyNumberA +
                ", а сумма DEF = " + luckyNumberB );

        //10. Отображение таблицы умножения Пифагора
        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("    ТАБЛИЦА     ПИФОГОРА");
        for (int r = 1; r < 10; r++) {
            if (r == 2) {
                System.out.println("----+------------------------");
            }
            for (int i = 1; i < 10; i++) {
                if (i == 2) {
                     System.out.printf("%2s", "|");
                 }
                if (r * i != 1) {
                    System.out.printf("%3d", r * i);
                } else {
                    System.out.printf("%3s", "   ");
                }
            }
            System.out.print("\n");
        }
    }
}