package chapters.chapter12.checkpoints;

public class CheckPoint12_05 {
    public static void main(String[] args) {
        try {
            int value = 30;//if it were 50, only rhe 12. would column run
            if (value < 40)
                throw new Exception("value is too small");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }

}
