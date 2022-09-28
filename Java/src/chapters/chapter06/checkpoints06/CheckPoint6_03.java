package chapters.chapter06.checkpoints06;

public class CheckPoint6_03 {
    public static void main(String[] args) {
        int max = max(8,5);
        System.out.println(max);
    }

    public static int max(int num1, int num2) {
        int result = 0;
        result = (num1 > num2) ? num1 : num2;
        return result;
    }
}
