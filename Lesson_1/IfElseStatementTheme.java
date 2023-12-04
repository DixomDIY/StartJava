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
        int maxNumberOne = 20;
        int maxNumberTwo = 41;
        if(maxNumberOne > maxNumberTwo) {
            System.out.println("Число 1 > числа 2");
        } else if (maxNumberOne < maxNumberTwo) {
            System.out.println("Число 1 < числа 2");
        } else {
            System.out.println("Число 1 = числу 2");
        }

        //3. Проверка числа
        System.out.println("\n3. Проверка числа");
        int checkNumber = -50;
        if(checkNumber == 0) {
            System.out.println(checkNumber + " = 0, прогамма завершилас");
            System.exit(1); 
        } else if(checkNumber % 2 == 0) {
            if(checkNumber > 0) {
                System.out.println(checkNumber + " является положительным и чётным");
            } else {
                System.out.println(checkNumber + " является отрицательным и чётным");
            }
        } else {
             if(checkNumber > 0) {
                System.out.println(checkNumber + " является положительным и не чётным");
            } else {
                System.out.println(checkNumber + " является отрицательным и не чётным");
            }
        }

        //4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int searchNumberOne = 123;
        int searchNumberTwo = 223; 
        if((searchNumberOne / 100 % 10 != searchNumberTwo / 100 % 10) && (searchNumberOne / 10 % 10 != searchNumberTwo / 10 % 10) && (searchNumberOne % 10 != searchNumberTwo % 10)) {
            System.out.println("Все цифры в разрядах разные");
        } else {
            if(searchNumberOne / 100 % 10 == searchNumberTwo / 100 % 10) {
                System.out.println("В числах " + searchNumberOne + " и " + searchNumberTwo + " в 1 разряде одинаковая цифра = " + searchNumberOne / 100 % 10);
            }
            if(searchNumberOne / 10 % 10 == searchNumberTwo / 10 % 10) {
                System.out.println("В числах " + searchNumberOne + " и " + searchNumberTwo + " в 2 разряде одинаковая цифра = " + searchNumberOne / 10 % 10);
            }
            if(searchNumberOne % 10 == searchNumberTwo % 10) {
                System.out.println("В числах " + searchNumberOne + " и " + searchNumberTwo + " в 3 разряде одинаковая цифра = " + searchNumberOne % 10);
            }
        }

        //6. Подсчет суммы вклада и начисленных банком %
        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 300100;
        if(deposit < 100000) {
            System.out.println("Сумма вкалада " + deposit + " руб, начислено 5% = " + (deposit / 100 * 5) + " руб, итого = " + (deposit + deposit / 100 * 5) + " руб");
        } else if (deposit <= 300000) {
            System.out.println("Сумма вкалада " + deposit + " руб, начислено 7% = " + (deposit / 100 * 7) + " руб, итого = " + (deposit + deposit / 100 * 7) + " руб");
        } else {
            System.out.println("Сумма вкалада " + deposit + " руб, начислено 10% = " + (deposit / 100 * 10) + " руб, итого = " + (deposit + deposit / 100 * 10) + " руб");
        }

        //7.Определение оценки по предметам
        System.out.println("\n7.Определение оценки по предметам");
        int hystory = 59;
        int programm = 92;
        int historyScore = 2;
        int programmScore = 2;
        if(hystory <= 60) {
            System.out.println("История оценка 2");
        } else if (hystory > 60 && hystory <= 73) {
            historyScore = 3;
            System.out.println("История оценка 3");
        } else if (hystory > 73 && hystory <= 91) {
            historyScore = 4;
            System.out.println("История оценка 4");
        } else if (hystory > 91) {
            historyScore = 5;
            System.out.println("История оценка 5");
        }
        if(programm <= 60) {
            System.out.println("Программирование оценка 2");
        } else if (programm > 60 && programm <= 73) {
            programmScore = 3;
            System.out.println("Программирование оценка 3");
        } else if (programm > 73 && programm <= 91) {
            programmScore = 4;
            System.out.println("Программирование оценка 4");
        } else if (programm > 91) {
            programmScore = 5;
            System.out.println("Программирование оценка 5");
        } 
        System.out.println("Средний балл оценок по предметам = " + (double)(programmScore + historyScore) / 2);
        System.out.println("Средний процент по предметам = " + (double)(programm + hystory) / 2 + "%");

        //8.Расчет годовой прибыли
        System.out.println("\n8.Расчет годовой прибыли");
        int monthlySales = 13000;
        int rentalCost = 5000;
        int productionCost = 9000;
        int profit = monthlySales - rentalCost - productionCost; 
        if(profit > 0) {
           System.out.println("Прибыль за год: +" + profit*12 + " руб.");
        } else {
           System.out.println("Прибыль за год: " + profit*12 + " руб.");  
        }     
    }
}