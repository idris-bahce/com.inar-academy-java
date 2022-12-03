package chapters.chapter13.exercises.Exercise13_16;


import chapters.chapter13.exercises.Exercise13_14.Rational;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("Usage: operand operator operand");
        }
        String[] operand1 = args[0].split("/");
        String[] operand2 = args[2].split("/");
        String operator = args[1];


        long[] op1 = turnOperandToLongArray(operand1);

        Rational r1 = new Rational()
    }

    private static long[] turnOperandToLongArray(String[] operand) {
        long[] arr = new long[2];
        for (String s : operand) {
            
        }
    }
}
