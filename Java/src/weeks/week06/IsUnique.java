package weeks.week06;

import java.util.Scanner;

public class IsUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = in.nextLine();
        boolean isUnique = false;
        int len = word.length();
        for (int i = 0; i < len ; i++) {
            char ch = word.charAt(i);
            for (int j = i+1; j <= len-1 ; j++) {
                char ch2 = word.charAt(j);
                if(ch!=ch2){
                    isUnique=true;
                }else {
                    isUnique=false;
                    break;
                }
            }
            if(!isUnique){
                break;
            }
        }
        if(isUnique){
            System.out.println(word + " is a unique word.");
        }else{
            System.out.println(word + " is not a unique word.");
        }
    }
}
