package chapters.chapter09.checkpoints;

public class CheckPoint9_12 {
    public static void main(String[] args) {
        A a = new A("idris");// here we should write a string
        a.print();
    }//The program does not compile because new A() is used in class Test, but class A does not have a default constructor.
}

class A {
    String s;

    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}
