package chapters.chapter09.exercises.Exercise9_11;

public class TestLinearEquation {
    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
        printResult(linearEquation);
        LinearEquation linearEquation1 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
        printResult(linearEquation1);
    }

    private static void printResult(LinearEquation linearEquation) {
        if (linearEquation.isSolvable()){
            System.out.println("X is " + linearEquation.getX() + " and  Y is " + linearEquation.getY());
        }else {
            System.out.println("The equation has no solution.");
        }
        System.out.println("--------------------");
    }
}
