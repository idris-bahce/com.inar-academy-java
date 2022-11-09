package chapters.chapter10.exercises.Exercise10_14;

public class TestDate {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(34355555133101L);
        System.out.println("The date is: ->" + myDate.getDay() + "/" + myDate.getMonth() + "/" + myDate.getYear());
        MyDate myDate1 = new MyDate();
        System.out.println("The current date is: ->" + myDate1.getDay() + "/" + myDate1.getMonth() + "/" + myDate1.getYear());
    }
}
