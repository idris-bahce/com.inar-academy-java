package chapters.chapter10.checkpoints;

public class CheckPoint10_15 {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//true
        System.out.println("Welcome to Java".replace("Java", "HTML"));
        System.out.println(s1.replace('o', 'T'));
        System.out.println(s1.replaceAll("o", "T"));
        System.out.println(s1.replaceFirst("o", "T"));
        s1.toCharArray();//it became an array
    }
}
