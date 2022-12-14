package chapters.chapter10.exercises.Exercise10_26;


public class Calculator {
    public static void main(String[] args) {
        String s = (args[0]);
        String[] equation = s.split( "\\s+");
        char op = '0';
        for (int i = 0; i < equation.length; i++) {
            if (equation[i].charAt(0) == '+' || equation[i].charAt(0) == '-' || equation[i].charAt(0) == '/'
                    || equation[i].charAt(0) == '*') {
                op = equation[i].charAt(0);
            }
        }
        int number1 = Integer.parseInt(equation[0]);
        int number2 = Integer.parseInt(equation[2]);
        int result = 0;
        switch (op) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                result = number1 / number2;
        }
        System.out.println(result);
    }
}
