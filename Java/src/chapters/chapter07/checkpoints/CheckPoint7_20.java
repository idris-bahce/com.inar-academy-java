package chapters.chapter07.checkpoints;

import chapters.chapter07.listings.VarArgsDemo;

public class CheckPoint7_20 {
    //yes we can except last one. Because it is int.
    public static void main(String[] args) {
        VarArgsDemo.printMax(1, 2, 2, 1, 4);
        VarArgsDemo.printMax(new double[]{1, 2, 3});
    }
}
