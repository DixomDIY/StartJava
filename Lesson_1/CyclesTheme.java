public class CyclesTheme{
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int lineSegmentStart = -10;
        int lineSegmentEnd = 21;
        int sumEvenNumbers = 0;
        int sumOddNumbers = 0;
        int pointer = lineSegmentStart;
        do {
            if(pointer % 2 == 0) {
                sumEvenNumbers++;
            } else {
                sumOddNumbers++;
            }
            pointer++;
        } while (lineSegmentStart <= pointer && pointer <= lineSegmentEnd);
        System.out.println("В отрезке [" + lineSegmentStart + ", " + lineSegmentEnd + 
            "] сумма четных чисел = " + sumEvenNumbers + ", а нечетных = " + sumOddNumbers);

        //2. Вывод чисел в порядке убывания
        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = a;
        int max = a; 
        if(b > max){
            max = b;
        }        
        if(c > max){
            max = c;
        } 
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        for (int i = max; i >= min; i--) {
            System.out.printf("%3d", i);
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int number = 1234;
        int originalNumber = number;
        int reversNumber = 0;
        while (number > 0 ) {
            int digit = number % 10;
            reversNumber = reversNumber * 10 + digit;
            number /= 10;
        }
        System.out.print("Реверсивное число = " + reversNumber);
        System.out.println("\nСумма чисел = " + (originalNumber + reversNumber));

        //4. Вывод чисел в несколько строк
        System.out.println("\n4. Вывод чисел в несколько строк");
        int semiIntervalStart = 1;
        int semiIntervalEnd = 24;
        for (int line = 0; line < (semiIntervalEnd - semiIntervalStart) / 5 + 1; line++) {
            for (int table = 0; table < 5; table++) {
                pointer = ((table + semiIntervalStart) + (line * 5));
                if (pointer > semiIntervalEnd) {
                    System.out.printf("%2d ", 0);
                } else {
                    System.out.printf("%2d ", pointer);
                }
            }
            System.out.println("");
        }

        //5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        number = 3242592;
        System.out.print("В " + number);
        String parityCheck = " ";
        int twos = 0;
        while (number > 0){
            if (number % 10 == 2) {
                twos++;
            }
            number /= 10;
        }
        if (twos % 2 != 0) {
            parityCheck = " не ";
        }
        System.out.println(parityCheck + "четное количество двоек - " + twos); 

        //6. Отображение геометрических фигур
        System.out.println("\n6. Отображение геометрических фигур");
        int rows = 5;
        for(int i = 0; i < rows; i++){
            System.out.println("**********");
        }
        System.out.println("");

        int row = rows;
        while (row != 0) {
            int column = 0;
            while (column < row) {
                System.out.print("#");
                column++;
            }
            System.out.println("");
            row--;
        }
        System.out.println("");
        
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
            } while(current < column);
            row++;
            System.out.println("");
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
        reversNumber = 0;
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
        for (int i = number; i > 0; i /= 10 ){
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
            for (int i = 1; i < 10; i++){
                if (i == 2) {
                     System.out.printf("%2s", "|");
                 }
                if (r * i != 1){
                    System.out.printf("%3d", r * i);
                } else {
                    System.out.printf("%3s", "   ");
                }
            }
            System.out.print("\n");
        }
    }
}