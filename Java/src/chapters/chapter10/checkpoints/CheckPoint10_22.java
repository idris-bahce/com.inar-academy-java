package chapters.chapter10.checkpoints;

public class CheckPoint10_22 {
    private String text;

    public CheckPoint10_22(String s){
        String text = s;// the problem is in here. we already initialised a field. we shouldn't put String again.
    }

    public static void main(String[] args) {
        CheckPoint10_22 test = new CheckPoint10_22("ABC");
        System.out.println(test.text.toLowerCase());
    }
}
