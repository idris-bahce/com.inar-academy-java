package chapters.chapter09.exercises.Exercise9_12;

import chapters.chapter09.exercises.Exercise9_11.LinearEquation;

import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args) {
        double[][] points = getFromUser();

        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = a * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double f = c * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        displayWhetherParallel(equation);
    }

    public static void displayWhetherParallel(LinearEquation equation) {
        if (equation.isSolvable()) {
            System.out.println("x: " + equation.getX() + " y: " + equation.getY());
        } else {
            System.out.println("The two lines are parallel");
        }
    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] p = new double[4][2];

        System.out.println("Enter four points x and y respectively: ");
        for (int i = 0; i < p.length; i++) {
            p[i][0] = input.nextDouble();
            p[i][1] = input.nextDouble();
        }

        return p;
    }
}
