package chapters.chapter10.exercises.Exercise10_24;

public class MyCharacter {
    private char c;


    public MyCharacter(char c) {
        this.c = c;
    }

    public boolean equals(char ch) {
        if (ch == c) {
            return true;
        } else
            return false;
    }

    public int compareTo(char ch) {
        return c - ch;
    }

    public char charValue() {
        return c;
    }
    public char toUpperCase(){
        return ('a' <= c && c <= 'z') ? c = (char) (c - 32) : c;
    }
    public char toLowerCase(){
        return ('A' <= c && c <= 'Z') ? c = (char) (c + 32) : c;
    }
    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static boolean isLetterOrDigit(char ch){
        return isLetter(ch) || isDigit(ch);
    }
}
