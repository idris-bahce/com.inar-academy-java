package chapters.chapter06.excercises06;

public class Exercise6_12 {
    public static void main(String[] args) {
        printChars('1', 'Z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int liner = 1;
        for (int i = (int)ch1; i < (int)ch2; i++) {
            char ch = (char)i;
            System.out.print(ch + " ");
            if (liner % numberPerLine == 0)
                System.out.println();
            liner++;
        }

    }

}
