package chapters.chapter06.checkpoints06;

public class CheckPoint6_06 {
    //if we don't write return in a value-returning method we will have syntax error and compiler won't process.
    //we can have return statement in void method in order to exit from the method.
    public static void main(String[] args) {
        xMethod(3,5);
    }

    private static void xMethod(int x, int y) {
        System.out.println(x+y);
        //return (x+y); we are having a syntax error in this case.
    }
}
