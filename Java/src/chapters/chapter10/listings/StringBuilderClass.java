package chapters.chapter10.listings;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java");

        System.out.println(stringBuilder);

        stringBuilder.insert(11,"HTML and ");
        System.out.println(stringBuilder);
    }
}
