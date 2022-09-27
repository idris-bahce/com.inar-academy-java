package chapters.chapter06.listings06;

public class StackOveflowExample {
    public static void main(String[] args) {
        method(0);
    }

    private static void method(int deepnesCounter) {
        deepnesCounter++;
        System.out.println(deepnesCounter);
        method(deepnesCounter);
    }
}
