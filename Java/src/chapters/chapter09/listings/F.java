package chapters.chapter09.listings;

public class F {
    private int x = 0; // Instance variable
    private int y = 0;
    public F() {
    }
    public void p() {
        int x = 1; // Local variable
        System.out.println("x = " + x + "," );
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        F test = new F();
        test.p();
        System.out.println(test.x);
    }
}
