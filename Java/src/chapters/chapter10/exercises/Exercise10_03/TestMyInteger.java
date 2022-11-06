package chapters.chapter10.exercises.Exercise10_03;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger number = new MyInteger(7);
        System.out.println("getValue(): " + number.getValue());
        System.out.println("isEven(): " + number.isEven());
        System.out.println("isOdd(): " + number.isOdd());
        System.out.println("isPrime(): " + number.isPrime());
        System.out.println("equals(10): " + number.equals(10));
        System.out.println("equals(MyInteger(1496875)): " + number.equals(new MyInteger(1496875)));
        System.out.println("isEven(1496875) static: " + MyInteger.isEven(1496875));
        System.out.println("isOdd(1496875) static: " + MyInteger.isOdd(1496875));
        System.out.println("isPrime(1496875) static: " + MyInteger.isPrime(1496875));
        System.out.println("parseInt(char[]{1, 2, 3}) static: " +
                MyInteger.parseInt(new char[]{'1', '2', '3'}));
        System.out.println("parseInt(String 123) static: " +
                MyInteger.parseInt("123"));
    }
}
