package chapters.chapter10.exercises.Exercise10_27;

public class MyStringBuilder1 {
    private String string;
    public MyStringBuilder1(String s){
        string = s;
    }
    public MyStringBuilder1 append(MyStringBuilder1 s){
        string += s;
        return new MyStringBuilder1(string);
    }
    public MyStringBuilder1 append(int i){
        string = string + i;
        return new MyStringBuilder1(string);
    }
    public int length(){
        return string.length();
    }
    public char charAt(int index){
        return string.charAt(index);
    }
    public MyStringBuilder1 toLowerCase(){
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if ('A'<=string.charAt(i)&&string.charAt(i)<='Z'){
                
            }
        }
    }
}
