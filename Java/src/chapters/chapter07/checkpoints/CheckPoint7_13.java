package chapters.chapter07.checkpoints;

public class CheckPoint7_13 {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] t = new int[source.length];
        System.arraycopy(source,0,t,0,source.length);
        for (int i :
                t) {
            System.out.print(i + " ");
        }
    }
}
