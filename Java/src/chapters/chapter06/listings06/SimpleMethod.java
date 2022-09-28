package chapters.chapter06.listings06;

public class SimpleMethod {
    public static int sum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i < num2 ; i++) {
            sum += i;
        }
        return sum;
    } public static void main(String[] args) {
        int sum = 0;
        System.out.println(sum(1,10));
        sum=sum(10,20);
        System.out.println(sum);

    }
}
