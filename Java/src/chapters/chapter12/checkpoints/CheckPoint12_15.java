package chapters.chapter12.checkpoints;

public class CheckPoint12_15 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

    static void method() throws Exception {
        System.out.println(1 / 0);
    }

}
