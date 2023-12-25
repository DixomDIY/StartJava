public class Calculator {

    private int a;
    private int b;
    private char sign;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public char getSign() {
        return sign;
    } 

    public double performCalculation() { 
        double result = 0;
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("На 0 делить нельзя");
                } else {
                    result = (double) a / b;
                }
                break;
            case '^':
                result = a;
                for (int i = 1; i < b; i++) {
                     result *= a;
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("На 0 делить нельзя");
                } else {
                    result = a % b;
                }
                break;
            default:
                System.out.println("Калькулятор не выполняет математические операции " + sign);
                break;
        }
        return result;
    }
}