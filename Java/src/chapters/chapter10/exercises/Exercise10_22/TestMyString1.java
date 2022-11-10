package chapters.chapter10.exercises.Exercise10_22;


public class TestMyString1 {
    public static void main(String[] args) {

        MyString1 a = new MyString1(new char[]{'H', 'A', 'P', 'P', 'Y'});
        print(a);
        MyString1 b = a.toLowerCase();
        print(b);
        MyString1 c = b.substring(0, 3);
        print(c);
        System.out.println(c.length());
        System.out.println(a.equals(b));
        MyString1 d = new MyString1(new char[]{'H', 'A', 'P', 'P', 'Y'});
        System.out.println(a.equals(d));
        MyString1 e = MyString1.valueOf(71367);
        print(e);
    }

    private static void print(MyString1 a) {
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }
}
