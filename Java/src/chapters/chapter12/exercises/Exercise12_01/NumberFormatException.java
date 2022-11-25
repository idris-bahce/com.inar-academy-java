package chapters.chapter12.exercises.Exercise12_01;

public class NumberFormatException {
    public static void main(String[] args){
        if (args.length != 3) {
            System.out.println("Usage: java NumberFormatException operand1 operator operand2");
            System.exit(0);
        }
            int num1 = 0;
            int num2 = 0;

            try {
                num1 = Integer.parseInt(args[0]);
                num2 = Integer.parseInt(args[2]);
            }catch (java.lang.NumberFormatException n){
                System.err.println("Wrong input!");
                System.exit(0);
            }


        int result = 0;

        switch (args[1].charAt(0)) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '.':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
