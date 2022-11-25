package chapters.chapter12.exercises.Exercise12_24;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class DataSet {
    public static void main(String[] args) throws IOException {
        final int NUMBER_OF_LINE = 1000;
        File file = new File("Salary.txt");
        if (file.exists()) {
            System.out.println("File already exists!");
            System.exit(0);
        }
        try (
                PrintWriter write = new PrintWriter(file)
        ) {
            for (int i = 0; i < NUMBER_OF_LINE; i++) {
                write.print("FirstName" + (i + 1) + " SecondName" + (i + 1) + getStatus() + getSalary(getStatus()) + "\n");
            }
        }

    }

    private static double getSalary(String status) {
        if (status.equals("assistant")) {
            return (int) (Math.random() * 30000 + 50000);
        } else if (status.equals("associate")) {
            return (int) (Math.random() * 50000 + 60000);
        } else {
            return (int) (Math.random() * 55000 + 75000);
        }
    }

    private static String getStatus() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return " assistant ";
            case 1:
                return " associate ";
            default:
                return " full ";
        }
    }
}
