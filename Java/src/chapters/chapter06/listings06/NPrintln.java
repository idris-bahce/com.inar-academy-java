package chapters.chapter06.listings06;

public class NPrintln {
    public static void main(String[] args) {
        nprintln("Hello Java!", 10);
    }

    public static void nprintln(String s, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(s);
        }
    }
}
