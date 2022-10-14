package chapters.chapter08.listings;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = getData(NUMBER_OF_DAYS, NUMBER_OF_HOURS);
        printData(NUMBER_OF_DAYS, NUMBER_OF_HOURS, data);


    }

    private static void printData(int NUMBER_OF_DAYS, int NUMBER_OF_HOURS, double[][][] data) {
        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperatureTotal = 0;
            double dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }

            System.out.println("Day " + i + "'s average temperature is " + (dailyTemperatureTotal/ NUMBER_OF_HOURS));
            System.out.println("Day " + i + "'s average humidity is " + (dailyHumidityTotal/ NUMBER_OF_HOURS));
        }
    }

    private static double[][][] getData(int NUMBER_OF_DAYS, int NUMBER_OF_HOURS) {
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++) {
            int day = in.nextInt();
            int hour = in.nextInt();
            double temperature = in.nextDouble();
            double humidity = in.nextDouble();
            data[day -1][hour - 1][0]=temperature;
            data[day -1][hour - 1][1]=humidity;
        }
        return data;
    }
}
