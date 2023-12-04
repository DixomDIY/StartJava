public class VariablesTheme {
    public static void main(String[] args) {
        //1. Вывод характеристик компьютера (это название задачи)
        System.out.println("1. Вывод характеристик компьютера");
        byte cores = 8;
        System.out.println("Количество ядер = " + cores);
        short ramMemorySize = 16384;
        System.out.println("Размер оперативной памяти = " + ramMemorySize + "Мб");
        int gpuMemorySize = 4096;
        System.out.println("Размер видео памяти = " + gpuMemorySize + "Мб");
        long displayResolution = 1080;
        System.out.println("Разрешение дисплея = " + displayResolution + "P");
        float cpuFrequency = 2.5f;
        System.out.println("Частота процессора = " + cpuFrequency + "Ггц");
        double gpuFrequency = 1.3;
        System.out.println("Частота графического процессора = " + gpuFrequency + "Ггц");
        char cpuFamily = 'Z';
        System.out.println("Семейство процессора = " + cpuFamily);
        boolean hasWiFi = true;
        System.out.println("WiFi модуль = " + hasWiFi);

        //2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        System.out.println("Общая стоимость товаров без скидки = " + (penPrice + bookPrice));
        System.out.println("Сумма скидки = " + ((penPrice + bookPrice) / 100) * 11);
        System.out.println("Общая стоимость товаров со скидкой = " + ((penPrice + bookPrice) - ((penPrice + bookPrice) / 100) * 11));

        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a"); 

         //4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte varByte = 127;
        byte varByteIncrement = ++varByte;
        varByte--; 
        System.out.println("byte = " + varByte + ", increment = " + varByteIncrement + ", decrement = " + --varByte);
        short varShort = 32767;
        short varShortIncrement = ++varShort;
        varShort--;
        System.out.println("short = " + varShort + ", increment = " + varShortIncrement + ", decrement = " + --varShort);
        int varInt = 2147483647;
        int varIntIncrement = ++varInt;
        varInt--;
        System.out.println("int = " + varInt + ", increment = " + varIntIncrement + ", decrement = " + --varInt);
        long varLong = 9223372036854775807l;
        long varLongIncrement = ++varLong;
        varLong--;
        System.out.println("long = " + varLong + ", increment = " + varLongIncrement + ", decrement = " + --varLong);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int varOne = 2;
        int varTwo = 5;
        System.out.println("C помощью третьей переменной");
        System.out.println("Исходные значения: переменная 1 = " + varOne + ", переменная 2 = " + varTwo);
        int varThree = varOne;
        varOne = varTwo;
        varTwo = varThree;
        System.out.println("Переставленное значения: переменная 1 = " + varOne + ", переменная 2 = " + varTwo);
        System.out.println("C помощью арифметических операций");
        System.out.println("Исходные значения: переменная 1 = " + varOne + ", переменная 2 = " + varTwo);
        varTwo = varOne + varTwo;
        varOne = varTwo - varOne;
        varTwo = varTwo - varOne;
        System.out.println("Переставленное значения: переменная 1 = " + varOne + ", переменная 2 = " + varTwo);
        System.out.println("C помощью побитовой операции ^");
        System.out.println("Исходные значения: переменная 1 = " + varOne + ", переменная 2 = " + varTwo);
        varOne = varOne ^ varTwo;
        varTwo = varOne ^ varTwo;
        varOne = varOne ^ varTwo;
        System.out.println("Переставленное значения: переменная 1 = " + varOne + ", переменная 2 = " + varTwo);

        //6 Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println("Код " + (int)dollar + " символ " + dollar);
        char asterisk = '*';
        System.out.println("Код " + (int)asterisk + " символ " + asterisk);
        char mail = '@';
        System.out.println("Код " + (int)mail + " символ " + mail);
        char verticalBar = '|';
        System.out.println("Код " + (int)verticalBar + " символ " + verticalBar);
        char tilde = '`';
        System.out.println("Код " + (int)tilde + " символ " + tilde);

        //7 Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParen = '(';
        char rightParen = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParen + " " + rightParen + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + backslash + underscore + underscore + backslash);

        //8 Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + number / 100);
        System.out.println("  десятков - " + number / 10);
        System.out.println("  едениц - " + number % 10);
        System.out.println("Сумма его цифер = " + (number / 100 % 10 + number / 10 % 10 + number % 10));
        System.out.println("Произведение = " + ((number / 100 % 10) * (number / 10 % 10) * (number % 10)));

        //9 Вывод времени
        System.out.println("\n9. Вывод времени");
        int second = 86399;
        int hours = second / 3600;
        int minutes = (second % 3600) / 60;
        int seconds = second % 60;       
        System.out.println(second + " секунд это: " + hours + ":" + minutes + ":" + seconds); 
    }
}