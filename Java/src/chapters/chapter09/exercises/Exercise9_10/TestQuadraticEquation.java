package chapters.chapter09.exercises.Exercise9_10;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1.0, 3, 1);
        printObject(quadraticEquation);
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(1,2,1);
        printObject(quadraticEquation1);
        QuadraticEquation quadraticEquation2 = new QuadraticEquation(1,2,3);
        printObject(quadraticEquation2);
    }

    private static void printObject(QuadraticEquation quadraticEquation) {
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root: " + quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no real roots.");
        }
        System.out.println("-----------------------------------");
    }
}
