package chapters.chapter10.exercises.Exercise10_28;

public class TestMyStringBuilder2 {
    public static void main(String[] args) {

        MyStringBuilder2 a = new MyStringBuilder2();
     //   print(a);
        MyStringBuilder2 b = new MyStringBuilder2(new char[]{'h', 'a', 'p'});
        print(b);
        MyStringBuilder2 c = new MyStringBuilder2("birthday");
        print(c);
        c.insert(3, new MyStringBuilder2("GIFT"));
        print(c);
        c.reverse();
        print(c);
        MyStringBuilder2 d = c.substring(3);
        print(d);
        d.toUpperCase();
        print(d);
    }

    private static void print(MyStringBuilder2 a) {
        for (int i = 0; i < a.getChars().length; i++) {
            System.out.print(a.getChars()[i]);
        }
        System.out.println();
    }
}
