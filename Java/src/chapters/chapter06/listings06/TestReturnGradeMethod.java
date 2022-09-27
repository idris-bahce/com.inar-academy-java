package chapters.chapter06.listings06;

public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(95));
        System.out.println("The grade is " + getGrade(75));
    }
    public static char getGrade(double x){
        if (x >=90) {
            return 'A';
        } else if (x >= 80) {
            return 'B';
        }else if (x >= 70) {
            return 'C';
        }else if (x >= 60) {
            return 'D';
        }else {
            return 'F';
        }
    }
}
