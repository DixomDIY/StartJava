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
            System.out.println("Число " + checkNumber + " = 0, прогамма завершилась"); 
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
        int numberA = 223; 
        int firstDigitA = numberA / 100  % 10;
        int secondDigitA = numberA / 10 % 10;
        int thirdDigitA = numberA % 10;
        int numberB = 123; 
        int firstDigitB = numberB / 100 % 10;
        int secondDigitB = numberB / 10 % 10;
        int thirdDigitB = numberB % 10; 
        if(firstDigitA != firstDigitB && secondDigitA != secondDigitB &&
                thirdDigitA != thirdDigitB) {
            System.out.println("В числах " + numberA + " и " + numberB +
                    "все цифры в разрядах разные");
        } else {
            if(firstDigitA == firstDigitB) {
                System.out.println("В числах " + numberA + " и " + numberB +
                        " в 1 разряде одинаковая цифра = " + firstDigitA);
            }
            if(secondDigitA == secondDigitB) {
                System.out.println("В числах " + numberA + " и " + numberB +
                        " в 2 разряде одинаковая цифра = " + secondDigitA);
            }
            if(thirdDigitA == thirdDigitB) {
                System.out.println("В числах " + numberA + " и " + numberB +
                        " в 3 разряде одинаковая цифра = " + thirdDigitA);
            }
        }

        //5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if(symbol > 47 && symbol < 58) {
            System.out.println("Символ " + symbol + " является цифрой");
        } else if (symbol > 64 && symbol < 91) {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol > 96 && symbol < 123) {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else {
            System.out.println("Символ " + symbol + " не буква и не цифра");
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300100;
        int interestRate;
        if(deposit < 100000) {
            interestRate = 5;
        } else if (deposit <= 300000) {
            interestRate = 7;
        } else {
            interestRate = 10;
        }
        System.out.println("Сумма вкалада " + deposit +
                " руб, начислено " + interestRate + "% = " + (deposit / 100 * interestRate) +
                " руб, итого = " + (deposit + deposit / 100 * 10) + " руб");

        //7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        int finalResultHystory = 59;
        int finalResultProgramm = 92;
        int historyGrade = 2;
        int programmGrade = 2;
        if(finalResultHystory > 60 && finalResultHystory <= 73) {
            historyGrade = 3; 
        } else if (finalResultHystory > 73 && finalResultHystory <= 91) {
            historyGrade = 4; 
        } else if (finalResultHystory > 91) {
            historyGrade = 5; 
        }
        if(finalResultProgramm > 60 && finalResultProgramm <= 73) {
            programmGrade = 3; 
        } else if (finalResultProgramm > 73 && finalResultProgramm <= 91) {
            programmGrade = 4; 
        } else if (finalResultProgramm > 91) {
            programmGrade = 5; 
        } 
        System.out.println("История оценка " + historyGrade);
        System.out.println("Программирование оценка " + programmGrade);
        System.out.println("Средний балл оценок по предметам = " +
                (double) (programmGrade + historyGrade) / 2);
        System.out.println("Средний процент по предметам = " +
                (double) (finalResultProgramm + finalResultHystory) / 2 + "%");

        //8.Расчет годовой прибыли
        System.out.println("\n8.Расчет годовой прибыли");
        int monthlySales = 13000;
        int rentalCost = 5000;
        int productionCost = 9000;
        int months = 12;
        int profit = monthlySales - rentalCost - productionCost; 
        if(profit > 0) {
           System.out.println("Прибыль за год: +" + profit * months + " руб.");
        } else {
           System.out.println("Прибыль за год: " + profit * months + " руб.");
        }
    }
}