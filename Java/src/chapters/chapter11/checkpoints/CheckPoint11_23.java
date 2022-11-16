package chapters.chapter11.checkpoints;

public class CheckPoint11_23 {
    public static void main(String[] args) {
        new W();
        new V();
    }
}
class W {
    int i = 7;
    public W() {
        setI(20);
        System.out.println("i from W is " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}
class V extends W {
    public V() {
        System.out.println("i from V is " + i);
    }
    public void setI(int i) {
        this.i = 3 * i;
    }
}