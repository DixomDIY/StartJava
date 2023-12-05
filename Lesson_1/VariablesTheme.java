public class VariablesTheme {
    public static void main(String[] args) {
        //1. Вывод характеристик компьютера (это название задачи)
        System.out.println("1. Вывод характеристик компьютера");
        byte cores = 8;
        System.out.println("Количество ядер = " + cores);
        short ramSize = 16384;
        System.out.println("Размер оперативной памяти = " + ramSize + "Мб");
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
        int totalPrice = penPrice + bookPrice;
        System.out.println("Общая стоимость товаров без скидки = " + totalPrice);
        System.out.println("Сумма скидки = " + totalPrice / 100 * 11);
        System.out.println("Общая стоимость со скидкой = " + (totalPrice - totalPrice / 100 * 11));

        //3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   ");
        System.out.println("   J   a a  v   v  a a  ");
        System.out.println("J  J  aaaaa  V V  aaaaa ");
        System.out.println(" JJ  a     a  V  a     a");

         //4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByte = 127;
        System.out.println("byte = " + maxByte + ", increment = " + ++maxByte +
                ", decrement = " + --maxByte);
        short maxShort = 32767; 
        System.out.println("short = " + maxShort + ", increment = " + ++maxShort +
                ", decrement = " + --maxShort);
        int maxInt = 2147483647;
        System.out.println("int = " + maxInt + ", increment = " + ++maxInt +
                ", decrement = " + --maxInt);
        long maxLong = 9223372036854775807l;
        System.out.println("long = " + maxLong + ", increment = " + ++maxLong +
                ", decrement = " + --maxLong);

        //5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println("C помощью третьей переменной");
        System.out.println("Исходные значения: переменная 1 = " + a + ", переменная 2 = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Переставленное значения: переменная 1 = " + a + ", переменная 2 = " + b);
        System.out.println("C помощью арифметических операций");
        System.out.println("Исходные значения: переменная 1 = " + a + ", переменная 2 = " + b);
        b += a;
        a = b - a;
        b -= a;
        System.out.println("Переставленное значения: переменная 1 = " + a + ", переменная 2 = " + b);
        System.out.println("C помощью побитовой операции ^");
        System.out.println("Исходные значения: переменная 1 = " + a + ", переменная 2 = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Переставленное значения: переменная 1 = " + a + ", переменная 2 = " + b);

        //6 Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println("Код " + (int) dollar + " символ " + dollar);
        char asterisk = '*';
        System.out.println("Код " + (int) asterisk + " символ " + asterisk);
        char mail = '@';
        System.out.println("Код " + (int) mail + " символ " + mail);
        char verticalBar = '|';
        System.out.println("Код " + (int) verticalBar + " символ " + verticalBar);
        char tilde = '`';
        System.out.println("Код " + (int) tilde + " символ " + tilde);

        //7 Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openBracket = '(';
        char closeBracket = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openBracket + " " + closeBracket +
                backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore +
                slash + backslash + underscore + underscore + backslash);

        //8 Вывод количества сотен, десятков и единиц числа
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int units =  number % 10;
        int dozens = number / 10;
        int hundreds = number / 100; 
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + dozens);
        System.out.println("  едениц - " + units);
        System.out.println("Сумма его цифер = " + (hundreds % 10 + dozens % 10 + units % 10));
        System.out.println("Произведение = " + (hundreds % 10 * dozens % 10 * units % 10));

        //9 Вывод времени
        System.out.println("\n9. Вывод времени");
        int counter = 86399;
        int hours = counter / 3600;
        int minutes = counter % 3600 / 60;
        int seconds = counter % 60;       
        System.out.println(" Число " + counter + " в формате ЧЧ:ММ:СС = " + hours + ":" + minutes + ":" + seconds); 
    }
}