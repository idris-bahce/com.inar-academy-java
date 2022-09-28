package chapters.chapter06.checkpoints06;

public class CheckPoint6_13 {
    public static void main(String[] args) {
        a();
        b();
        c();
        d();
    }
    private static void a() {
        System.out.println("a()\n");
        int max = 0;
        max(1, 2, max);
        System.out.println(max);
    }

    public static void max(
            int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
    }

    private static void b() {
        System.out.println("b()\n");
        int i = 1;
        while (i <= 6) {
            method1(i, 2);
            i++;
        }
    }

    public static void method1(
            int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }

    private static void c() {
        System.out.println("c()\n");
        // Initialize times
        int times = 3;
        System.out.println("Before the call,"
                + " variable times is " + times);
        // Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call,"
                + " variable times is " + times);
    }

        // Print the message n times
    public static void nPrintln(
            String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
    private static void d() {
        System.out.println("d();\n");
        int i = 0;
        while (i <= 4) {
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
    }
    public static void method1(int i) {
        do {
            if (i % 3 != 0)
                System.out.print(i + " ");
            i--;
        }
        while (i >= 1);
        System.out.println();
    }
}
