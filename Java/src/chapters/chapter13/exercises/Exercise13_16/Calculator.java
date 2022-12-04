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


        Rational r1 = new Rational(Integer.parseInt(operand1[0]),Integer.parseInt(operand1[1]));
        Rational r2 = new Rational(Integer.parseInt(operand2[0]),Integer.parseInt(operand2[1]));

        String print = args[0];
        switch (operator){
            case "+" : print += " = " + r1.add(r2);
                break;
            case "-" : print += " = " + r1.subtract(r2);
                break;
            case "*" : print += " = " + r1.multiply(r2);
                break;
            case "/" : print += " = " + r1.divide(r2);
                break;
        }

        System.out.println(print);
    }

}
