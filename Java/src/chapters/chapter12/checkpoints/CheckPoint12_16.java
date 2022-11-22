package chapters.chapter12.checkpoints;

public class CheckPoint12_16 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in main");
        } catch (Exception ex) {
            System.out.println("Exception in main");
        }
    }

    static void method()  {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        } catch (Exception ex) {
            System.out.println("Exception in method()");
        }
    }
}
