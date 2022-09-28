package chapters.chapter06.checkpoints06;

public class CheckPoint6_02 {
    public static void main(String[] args) {
        method("hello", 5);//Here we invoke a method.
    }

    private static void method(String s, int i) {//Here we define a method.
        int counter = 1;
        for (int j = 0; j < i; j++) {
            System.out.println(counter + ". " + s);
            counter++;
        }
    }
}
