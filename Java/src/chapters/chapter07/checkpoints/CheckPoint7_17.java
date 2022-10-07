package chapters.chapter07.checkpoints;

public class CheckPoint7_17 {
    public static void main(String[] args) {
        a();
        b();
    }
    public static void a() {
        int number = 0;
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number
                + " and numbers[0] is " + numbers[0]);
    }
    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }
    public static void b() {
        int[] list = {1, 2, 3, 4, 5};
        reverse(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    public static void reverse(int[] list) {
        int[] newList = new int[list.length];
        for (int i = 0; i < list.length; i++)
            newList[i] = list[list.length - 1 - i];
        list = newList;

    }
}
