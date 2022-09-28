package chapters.chapter06.listings06;

public class Swap {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Values of num1 and num2 before swap respectively are: " + num1 + ", " + num2);

        swap(num1,num2);

        System.out.println("Values of num1 and num2 after swap respectively are: " + num1 + ", " + num2);

    }

    private static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Values of num1 and num2 int the swap respectively are: " + num1 + ", " + num2);
    }
}
