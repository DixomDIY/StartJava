public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        char sign = '^';
        boolean isError = false;
        double result = 0;
        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            if (b == 0) {
                System.out.println("На 0 делить нельзя");
                isError = true;
            }else{
                result = (double) a / b;
            }
        } else if (sign == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else if (sign == '%') {
            if (b == 0) {
                System.out.println("На 0 делить нельзя");
                isError = true;
            } else {
                result = a % b;
            }
        } else {
            System.out.println("Калькулятор не умеет выполнять вычисление " + sign);
            isError = true;
        }
        if(!isError){
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } 
    }
}