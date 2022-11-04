package chapters.chapter10.listings;

public class Strings {
    public static void main(String[] args) {
        String str = "Java is the best language. Java";
        String str1 = str.replace("a","e");
        System.out.println(str1);
        System.out.println("---------------");
        String str2 = str.replace("Java","Pyton");
        System.out.println(str2);
        System.out.println("----------------");
        String str3 = str.replaceAll("Java","Pyton");
        System.out.println(str3);
        System.out.println("----------------");
        String str4 = str.replaceFirst("Java","Pyton");
        System.out.println(str4);

        String[] str5 = str.split(" ");
        for (String a :
                str5) {
            System.out.println(a);
        }
    }
}
