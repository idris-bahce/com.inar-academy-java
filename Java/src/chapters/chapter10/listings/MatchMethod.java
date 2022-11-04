package chapters.chapter10.listings;

public class MatchMethod {
    public static void main(String[] args) {
        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));
        System.out.println("-------------------");
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("Java is cool".matches("Java.*"));
        System.out.println("Java is powerful".matches("Java.*"));
        System.out.println("------------------------");
        System.out.println("440-02-4534".matches("\\d{3}-\\d{2}-\\d{4}"));
        System.out.println("------------------------");
        String s = "a+ab$#c".replaceAll("[#$+]","N");
        System.out.println(s);

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2, 6, dst, 4);
        for (char a :
                dst) {
            System.out.print(a);
        }
        System.out.println();
        System.out.println("----------------");
        String s1 = new String(dst);
        System.out.println(s1);
    }
}
