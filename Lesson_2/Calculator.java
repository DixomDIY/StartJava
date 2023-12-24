public class Calculator {

    private int a = 5;
    private int b = 2;
    private char sign = '^';
    private double result = 0;

    public void setA (int a) {
        this.a = a;
    }

    public int getA () {
        return a;
    }

    public void setB (int b) {
        this.b = b;
    }

    public int getB () {
        return b;
    }

    public void setSign (char sign) {
        this.sign = sign;
    }

    public char getSign () {
        return sign;
    }

    public double getResult() {
        return result;
    }

    public boolean calculation() {
        boolean hasSolve = true;
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
                    hasSolve = false;
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
                    hasSolve = false;
                } else {
                    result = a % b;
                }
                break;
            default:
                System.out.println("Калькулятор не пыполняет математические операции " + sign);
                hasSolve = false;
                break;
        }
        return hasSolve;
    }
}