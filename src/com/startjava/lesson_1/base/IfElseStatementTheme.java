package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java (это название задачи)
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean male = true;
        if(!male) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }

        int age = 22;
        if(age > 18) {
            System.out.println("Старше 18 лет");
        } else {
            System.out.println("Младше 18 лет");
        }

        double height = 2.5;
        if(height < 1.8) {
            System.out.println("Рост меньше 1.8 метра");
        } else {
            System.out.println("Рост больше 1.8 метра");
        }

        char firstLetter = "Name".charAt(0);
        if(firstLetter == 'M') {
            System.out.println("Первая буква имена 'M");
        } else if (firstLetter == 'I') {
            System.out.println("Первая буква имена 'I");
        } else {
            System.out.println("Первая буква имени не 'M' и не 'I'");
        }

         //2. Поиск большего числа
        System.out.println("\n2. Поиск большего числа");
        int a = 20;
        int b = 41;
        if(a > b) {
            System.out.println(a + " > " + b);
        } else if (a < b) {
            System.out.println(a + " < " + b);
        } else {
            System.out.println(a + " = " + b);
        }

        //3. Проверка числа
        System.out.println("\n3. Проверка числа");
        int checkNumber = 50;
        if(checkNumber == 0) {
            System.out.println("Число = 0"); 
        } else {
            String polarity = " положительным ";
            if(checkNumber < 0) {
                polarity = " отрицательным ";
            }
            String parityCheck = " ";
            if(checkNumber % 2 != 0) {
                parityCheck = " не ";
            }
            System.out.println(checkNumber + " является" + polarity + "и" + parityCheck + "чётным");
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        a = 223;
        int hundredsA = a / 100 % 10;
        int tensA = a / 10 % 10;
        int onesA = a % 10;
        b = 123;
        int hundredsB = b / 100 % 10;
        int tensB = b / 10 % 10;
        int onesB = b % 10;
        if(onesA != onesB && tensA != tensB && hundredsA != hundredsB) {
            System.out.println("В числах " + a + " и " + b + " все цифры в разрядах разные");
        } else {
            if(onesA == onesB) {
                System.out.println("В числах " + a + " и " + b +
                        " в 1 разряде одинаковая цифра = " + onesA);
            }
            if(tensA == tensB) {
                System.out.println("В числах " + a + " и " + b +
                        " в 2 разряде одинаковая цифра = " + tensA);
            }
            if(hundredsA == hundredsB) {
                System.out.println("В числах " + a + " и " + b +
                        " в 3 разряде одинаковая цифра = " + hundredsA);
            }
        }

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if(symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не цифра");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300100;
        int interestRate = 5;
        if (deposit >= 300000) {
            interestRate = 10;
        } else if(deposit >= 100000){
            interestRate = 7;
        }
        System.out.println("Сумма вкалада " + deposit +
                " руб, начислено " + interestRate + "% = " + (deposit / 100 * interestRate) +
                " руб, итого = " + (deposit + deposit / 100 * interestRate) + " руб");

        //7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        int historyPercent = 59;
        int historyGrade = 2;
        if(historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else if (historyPercent > 91) {
            historyGrade = 5;
        }
        int programmPercent = 92;
        int programmGrade = 2;
        if(programmPercent > 60 && programmPercent <= 73) {
            programmGrade = 3;
        } else if (programmPercent > 73 && programmPercent <= 91) {
            programmGrade = 4;
        } else if (programmPercent > 91) {
            programmGrade = 5;
        } 
        System.out.println("История оценка " + historyGrade);
        System.out.println("Программирование оценка " + programmGrade);
        System.out.println("Средний балл оценок по предметам = " +
                (double) (programmGrade + historyGrade) / 2);
        System.out.println("Средний процент по предметам = " +
                (double) (programmPercent + historyPercent) / 2 + "%");

        //8.Расчет годовой прибыли
        System.out.println("\n8.Расчет годовой прибыли");
        int monthlySales = 13000;
        int rentalCost = 5000;
        int productionCost = 9000;
        int profit = (monthlySales - rentalCost - productionCost) * 12;
        if(profit > 0) {
           System.out.println("Прибыль за год: +" + profit + " руб.");
        } else {
           System.out.println("Прибыль за год: " + profit + " руб.");
        }
    }
}