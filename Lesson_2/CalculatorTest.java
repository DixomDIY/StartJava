import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        boolean isCalculations = true;
        while(isCalculations) {
            Scanner scaner = new Scanner(System.in);
            Calculator calc = new Calculator();
            System.out.print("Введите первое число: ");
            calc.setA(scaner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scaner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setB(scaner.nextInt());
            scaner.nextLine();
            
            if (calc.calculation()) {
                System.out.println(calc.getA() + " " + calc.getSign() + " " + calc.getB() +
                    " = " + calc.getResult());
            }

            boolean isCorrectAnswer = false;
            while (!isCorrectAnswer) {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                String answer = scaner.nextLine();
                if (answer.equals("yes")) {
                    isCorrectAnswer = true;
                    isCalculations = true;
                } else if (answer.equals("no")) {
                    isCorrectAnswer = true;
                    isCalculations = false;
                }
            }
        }
    }
}