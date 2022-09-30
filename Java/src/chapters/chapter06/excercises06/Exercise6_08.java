package chapters.chapter06.excercises06;

public class Exercise6_08 {
    public static void main(String[] args) {
        System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");
        System.out.println("---------------------------------------");
        int l = 120;//these are for controlling second loop
        int k = 119;//these are for controlling second loop
        for (int i = 40; i > 30; i--) {
            System.out.printf("%2d %10.1f %7s",i ,celsiusToFahrenheit(i)," | ");
            for (int j = l; j >k ; j-=10) {
                System.out.printf("%3d %12.2f",j ,fahrenheitToCelsius(j));
            }
            System.out.println();
            k-=10;
            l-=10;
        }


    }

    /** Convert from Fahrenheit to Celsius */
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }


    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
