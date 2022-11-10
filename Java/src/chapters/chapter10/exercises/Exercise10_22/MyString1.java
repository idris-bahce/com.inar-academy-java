package chapters.chapter10.exercises.Exercise10_22;

public class MyString1 {
    private char[] chars = new char[10];

    public MyString1(char[] chars) {
        if (chars.length>=this.chars.length){
            char[] temp = new char[this.chars.length * 2];
            System.arraycopy(this.chars,0,temp,0,this.chars.length);
            this.chars = temp;
        }
        this.chars = chars;
    }
    public char charAt(int i){
        return chars[i];
    }
    public int length(){
        return this.chars.length;
    }
    public MyString1 substring(int begin, int end){
        if (begin < 0 || end > length() || begin > end) {
            System.out.println("Invalid substring parameters!");
            System.exit(1);
        }
        char[] substring = new char[end - begin];
        for (int i = begin, j = 0; i < end;j++, i++) {
            substring[j] = this.chars[i];
        }
        return new MyString1(substring);
    }
    public MyString1 toLowerCase(){
        char[] chars1 = new char[chars.length];
        for (int i = 0; i < this.chars.length; i++) {
            if (64<chars[i]&&chars[i]<91){
                chars1[i] =(char)((int)chars[i] + 32);
            }
            chars1[i] = chars[i];
        }
        return new MyString1(chars1);
    }
    public boolean equals(MyString1 s){
        if (this.chars.length != s.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (this.chars[i] != s.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static MyString1 valueOf(int i){
        String s = "" + i;
        char[] ch = new char[s.length()];
        for (int j = 0; j < s.length(); j++) {
            ch[j] = s.charAt(j);
        }
        return new MyString1(ch);
    }
}
