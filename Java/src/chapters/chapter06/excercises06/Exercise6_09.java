package chapters.chapter06.excercises06;

public class Exercise6_09 {
    public static void main(String[] args) {
        System.out.println("Feet  meters  |  meters  Feet");
        System.out.println("-----------------------------");
        int l = 20;//these are for controlling second loop
        int k = 21;//these are for controlling second loop
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d %7.3f %5s", i, footToMeter(i), " | ");
            for (int j = l; j < k; j +=5) {
                System.out.printf("%4d %9.3f", j, meterToFoot(j));
            }
            System.out.println();
            k+=5;
            l+=5;
        }

    }
    /** Convert from feet to meters */
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }

    /** Convert from meters to feet */
    public static double meterToFoot ( double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}