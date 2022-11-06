package chapters.chapter10.checkpoints;

public class CheckPoint10_31 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        StringBuilder s2 = new StringBuilder("HTML");
        s1.append(" is fun");//Java is fun
        s1.append(s2);//JavaHTML
        s1.insert(2, "is fun");//Jais funva is fun
        s1.insert(1, s2);//JHTMLava
        s1.charAt(2);//v
        s1.length();//4
        s1.deleteCharAt(3);//Jav
        s1.delete(1, 3);//Ja
        s1.reverse();//avaJ
        s1.replace(1, 3, "Computer");//JComputera
        s1.substring(1, 3);//av
        s1.substring(2);//va
    }
}
