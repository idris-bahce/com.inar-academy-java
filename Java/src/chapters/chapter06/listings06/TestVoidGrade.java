package chapters.chapter06.listings06;

public class TestVoidGrade {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(95);
        System.out.print("The grade is ");
        printGrade(75);
    }
    public static void printGrade(int grade){
        if (grade>=90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        }else if (grade >= 80) {
            System.out.println("C");
        }else if (grade >= 80) {
            System.out.println("D");
        }else  {
            System.out.println("F");
        }
    }
}
