package chapters.chapter06.listings06;

public class TestVoidGrade {
    public static void main(String[] args) {
        System.out.print("The grade is: ");
        printVoid(95);
        System.out.print("The grade is: ");
        printVoid(75);
    }

    public static void printVoid(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid score");
            return;
        }
        if (grade>=90){
            System.out.println("A");
        }else if (grade>=80){
            System.out.println("B");
        }else if (grade>=70){
            System.out.println("C");
        }else if (grade>=60){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}
