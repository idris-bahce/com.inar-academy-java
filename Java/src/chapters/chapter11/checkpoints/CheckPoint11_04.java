package chapters.chapter11.checkpoints;

public class CheckPoint11_04 {

}
class A {
    public A() {
        System.out.println(
                "A's no-arg constructor is invoked");
    }
}
class B extends A {
}
class C {
    public static void main(String[] args) {
        B b = new B();
    }
}
class D {
    public D() {//int x was an argument passed but it shouldn't, because if we do that we can't invoke it from other class
    }
}
class E extends D {
    public E() {
    }
}
class F {
    public static void main(String[] args) {
        E b = new E();
    }
}