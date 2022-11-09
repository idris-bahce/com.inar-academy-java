package chapters.chapter10.exercises.Exercise10_15;

import chapters.chapter10.exercises.Exercise10_13.MyRectangle2D;

import java.util.Scanner;

public class BoundingRectangle {
    public static void main(String[] args) {
        double[][] arr = new double[5][2];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter five points: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextDouble();
            }
        }
        MyRectangle2D r1 = getRectangle(arr);
        System.out.println("The bounding rectangle's center (" + r1.getX() +
                ", " + r1.getY() + "), width " + r1.getWidth() + ", height " +
                r1.getHeight());
    }

    private static MyRectangle2D getRectangle(double[][] arr) {
        double lowX = arr[0][0];
        double lowY = arr[0][1];
        double highX = arr[1][0];
        double highY = arr[1][1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0]<lowX)
                lowX = arr[i][0];
            if (arr[i][1]<lowY)
                lowY = arr[i][1];
            if (arr[i][0]>highX)
                highX = arr[i][0];
            if (arr[i][0]>highY)
                highY = arr[i][1];
        }
        double width = highX - lowX;
        double height = highY - lowY;
        double x = lowX + (width / 2);
        double y = lowY + (height / 2);
        return new MyRectangle2D(x,y,width,height);
    }
}
