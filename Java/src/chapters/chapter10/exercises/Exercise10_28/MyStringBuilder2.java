package chapters.chapter10.exercises.Exercise10_28;

import chapters.chapter10.exercises.Exercise10_27.MyStringBuilder1;

public class MyStringBuilder2 {
    private char[] chars;

    public MyStringBuilder2(){
    }
    public MyStringBuilder2(char[] chars){
        this.chars = chars;
    }
    public MyStringBuilder2(String s){
        chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
    }
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s){
        char[] temp = new char[chars.length + s.chars.length];
        for (int i = temp.length - 2 - offset, k = offset; i < temp.length;k++, i++) {
            temp[i] = chars[k];
        }
        for (int i = 0; i < offset; i++) {
            temp[i] = chars[i];
        }
        for (int i = 0, k = offset; i < s.getChars().length;k++, i++) {
            temp[k] = s.chars[i];
        }
        chars = temp;
        return new MyStringBuilder2(chars);
    }

    public MyStringBuilder2 reverse(){
        char[] temp = new char[chars.length];
        for (int i = chars.length - 1,k = 0; i >= 0; i--, k++) {
            temp[k] = chars[i];
        }
        chars = temp;
        return new MyStringBuilder2(chars);
    }
    public MyStringBuilder2 substring(int begin){
        char[] temp = new char[chars.length - begin];
        for (int i = 0, k=begin; i < temp.length;k++, i++) {
            temp[i] = chars[k];
        }
        chars = temp;
        return new MyStringBuilder2(chars);
    }
    public MyStringBuilder2 toUpperCase(){
        char[] temp = new char[chars.length];
        for (int i = 0; i < temp.length; i++) {
            if ('a'<=chars[i]&&chars[i]<='z'){
                temp[i] = (char)(chars[i] - 32);
            }else {
                temp[i]=chars[i];
            }
        }
        chars = temp;
        return new MyStringBuilder2(chars);
    }

    public char[] getChars() {
        return chars;
    }
}
