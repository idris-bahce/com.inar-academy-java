package chapters.chapter06.checkpoints06;

public class CheckPoint6_12 {
    public static void main(String[] args) {
        nPrintln("Welcome to Java!",5 );
    }

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
}
