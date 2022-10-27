package chapters.chapter09.checkpoints;

public class CheckPoint9_34 {
    private int id;
    public void m1() {
        this.id = 45;
    }
    public void m2() {
     // CheckPoint9_34.id = 45; This is wrong, since id is an instance member and cannot be accessed from a class.
    }
}
