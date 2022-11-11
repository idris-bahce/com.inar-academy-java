package chapters.chapter10.exercises.Exercise10_23;

public class MyString2 {
    private String string;

    public MyString2(String string){
        this.string = string;
    }
    public int compare(String s){
        int len1 = string.length();
        int len2 = s.length();
        int limit = Math.min(len2,len1);

        char[] ch1 = string.toCharArray();
        char[] ch2 = s.toCharArray();

        for (int i = 0; i < limit; i++) {
            char c1 = ch1[i];
            char c2 = ch2[i];
            if (c1 != c2){
                return c1 - c2;
            }
        }
        return len1 - len2;
    }
    public MyString2 substring(int begin){
        String s = "";
        for (int i = begin; i < string.length(); i++) {
            s = s + string.charAt(i);
        }
        return new MyString2(s);
    }

    public MyString2 toUpperCase(){
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if ('a'<= string.charAt(i)&&string.charAt(i)<='z'){
                s = s + (char)(string.charAt(i) - 32);
            }else {
                s = s + string.charAt(i);
            }
        }
        return new MyString2(s);
    }
    public char[] toChars(){
        char[] ch = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
        }
        return ch;
    }
    public static MyString2 valueOf(boolean b) {
        return new MyString2(b ? "true" : "false");
    }

}
