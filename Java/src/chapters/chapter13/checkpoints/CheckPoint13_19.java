package chapters.chapter13.checkpoints;

public class CheckPoint13_19 {
    public static void main(String[] args) {
        Integer n1 = new Integer(3);
        Object n2 = new Integer(4);
        System.out.println(n1.compareTo((Integer) n2));//you have to cast it to integer class like this one in here
    }
}
