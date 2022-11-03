package chapters.chapter10.checkpoints;

public class CheckPoint10_10 {
    public static void main(String[] args) {
        Integer x = new Integer(3);
        System.out.println(x.intValue());
        System.out.println(x.compareTo(new Integer(4)));//compare to method returns 0, if it is equals to value,returns 1
        // if it is smaller than value, returns -1 if it is bigger than value.
    }
}
