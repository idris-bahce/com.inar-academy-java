package chapters.chapter12.exercises.Exercise12_25;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProcessLargeDataSet {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\idris\\workspace\\" +
                "com.inar-academy-java\\Java\\src\\chapters\\chapter12\\exercises\\Exercise12_25\\Salary.txt");
        //Normally we would use URL url = new URL(http://cs.armstrong.edu/liang/data/Salary.txt.)
        //But since we couldn't access to the website, we will use our own created list of txt file.
        int totalSalaryOfAssistants = 0;
        int numberOFAssistants = 0;
        int totalSalaryOfAssociates = 0;
        int numberOFAssociates = 0;
        int totalSalaryOfFull = 0;
        int numberOFFulls = 0;
        String[] strings;
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()){
                strings = input.nextLine().split(" ");
                switch (strings[2]){
                    case "assistant":
                        totalSalaryOfAssistants += (int) Double.parseDouble(strings[3]);
                        numberOFAssistants++;
                        break;
                    case "associate":
                        totalSalaryOfAssociates += (int)Double.parseDouble(strings[3]);
                        numberOFAssociates++;
                        break;
                    default:
                        totalSalaryOfFull += (int)Double.parseDouble(strings[3]);
                        numberOFFulls++;
                }
            }
        }
        int total = totalSalaryOfAssistants +totalSalaryOfAssociates + totalSalaryOfFull;
        double averageOfAssistants = totalSalaryOfAssistants / (numberOFAssistants * 1.0);
        double averageOfAssociates = totalSalaryOfAssociates / (numberOFAssociates * 1.0);
        double averageOfFulls = totalSalaryOfFull / (numberOFFulls * 1.0);

        System.out.println("Total salary of assistants is: " + totalSalaryOfAssistants + "\nAverage salary of assistants is: " + averageOfAssistants
        + "\nTotal salary of associates is: " + totalSalaryOfAssociates + "\nAverage salary of associates is: " + averageOfAssociates
        + "\nTotal salary of full professors is: " + totalSalaryOfFull + "\nAverage salary of full professors is: " + averageOfFulls);
        System.out.println("Total salary of the faculty is: " + total
        + "\nAverage salary of the faculty is: " + (total / (numberOFAssistants + numberOFAssociates + numberOFFulls)));

    }
}
