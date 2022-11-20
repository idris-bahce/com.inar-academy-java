package weeks.week15;

import java.util.Scanner;

public class Test {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Calculator calculate = new Calculator(in.nextDouble());
        System.out.println("Press \"Q\" to exit. Press \"C\" to clear. Press \"M\" to get negative of the number.");
        char operator;
        while (true) {
            while (true) {
                operator = in.next().toUpperCase().charAt(0);
                if (operator == '+' || operator == '*' || operator == '/' 
                        || operator == '-' || operator == '%') {
                    break;
                } else if (operator == 'M') {
                    calculate.convertNegative();
                    System.out.println(calculate);
                } else if (operator == 'Q') {
                    System.exit(0);
                } else if (operator == 'C') {
                    calculate.clear();
                    System.out.println(calculate);
                } else {
                    System.err.println("Please enter an operator");
                }
            }
            double num = in.nextDouble();
            calculateMethod(calculate, operator, num);
        }
    }

    private static void calculateMethod(Calculator calculate, char operator, double num) {
        switch (operator){
            case '+':
                calculate.add(num);
                break;
            case '-':
                calculate.subtract(num);
                break;
            case '*':
                calculate.multiply(num);
                break;
            case '/':
                calculate.divide(num);
                break;
            default:
                calculate.modify(num);
        }
        System.out.println(calculate);
    }
}
