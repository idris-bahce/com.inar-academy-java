package chapters.chapter10.checkpoints;

public class CheckPoint10_18 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";
        s2 = s1.replaceAll("e","E");
        String[] tokens = "Welcome to Java and HTML".split(" ");
        s1 = tokens[0];
        s2 = tokens[1];
        System.out.println(s1);
        System.out.println(s2);
    }
}
