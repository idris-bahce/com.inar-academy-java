package weeks.week15;

public class Test {
    public static void main(String[] args) {
        Calculator calculate = new Calculator(5);
        calculate.add(5);
        System.out.println(calculate);
        calculate.extract(2);
        System.out.println(calculate);
        calculate.divide(2);
        System.out.println(calculate);
        calculate.multiply(5);
        System.out.println(calculate);
        calculate.convertNegative();
        System.out.println(calculate);
        calculate.clear();
        System.out.println(calculate);

    }
}
