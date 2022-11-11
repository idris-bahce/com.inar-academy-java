package chapters.chapter10.exercises.Exercise10_23;

public class TestMyString2 {
    public static void main(String[] args) {

        MyString2 a = new MyString2("happy");
        print(a);
        String s = "happy";
        System.out.println(a.compare(s));
        MyString2 b = new MyString2("haz");
        System.out.println(b.compare(s));
        MyString2 c = new MyString2("had");
        System.out.println(c.compare(s));
        MyString2 d = new MyString2("happyyyyyy");
        System.out.println(d.compare(s));
        MyString2 e = new MyString2("ha");
        System.out.println(e.compare(s));
        MyString2 f = a.substring(0);
        print(f);
        MyString2 g = a.substring(3);
        print(g);
        MyString2 h = a.toUpperCase();
        print(h);
        boolean boo = true;
        MyString2 i = MyString2.valueOf(boo);
        print(i);
        boo = false;
        MyString2 j = MyString2.valueOf(boo);
        print(j);
    }
    public static void print(MyString2 a){
        char[] ch = a.toChars();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
