package chapters.chapter11.checkpoints;

public class CheckPoint11_22 {
    public static void main(String[] args) {
        M a = new M(3);
    }
}
//The default constructor of Object is invoked, when new A(3) is invoked.
// The Object's constructor is invoked before any statements in B's constructor are executed.
class M extends N {
    public M(int t) {
        System.out.println("M's constructor is invoked");
    }
}

class N {
    public N() {
        System.out.println("N's constructor is invoked");
    }
}