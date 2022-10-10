package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise7_25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.println("Enter a, b, c: ");
        double a = in.nextDouble();
        eqn[0] = a;
        double b = in.nextDouble();
        eqn[1] = b;
        double c = in.nextDouble();
        eqn[2] = c;
        if(hasRoots(eqn)){
            int realRoots = solveQuadratic(eqn,roots);
            System.out.println("There are " + realRoots + " roots:");
            for (int i = 0; i < roots.length; i++) {
                System.out.print(roots[i] + "       ");
            }
        }else if(eqn[1]*eqn[1] - 4*eqn[0]*eqn[2] == 0){
            System.out.println("Root is:" + roots[0]);
        }else{
            System.out.println("There are no roots.");
        }
    }

    public static boolean hasRoots(double[] eqn) {
        if (eqn[1]*eqn[1] - 4*eqn[0]*eqn[2] > 0){
            return true;
        }else
            return false;
    }

    public static int solveQuadratic(double[] eqn, double[] roots){
        double r1 = (-eqn[1] + Math.pow(eqn[1]*eqn[1] - (4*eqn[0]*eqn[2]), 0.5)) / (2 * eqn[0]);
        double r2 = (-eqn[1] - Math.pow(eqn[1]*eqn[1] - (4*eqn[0]*eqn[2]), 0.5)) / (2 * eqn[0]);
        roots[0] = r1;
        roots[1] = r2;


        return 2;
    }
}
