package chapters.chapter10.exercises.Exercise10_02;

public class TestBmi {
    public static void main(String[] args) {
        BMI bmi = new BMI("idris",26,96,1.91);
        printStatus(bmi);
    }

    private static void printStatus(BMI bmi) {
        System.out.println("--------STATUS CARD-----------");
        System.out.println("Name: " + bmi.getName() + "\n"
        + "Age: " + bmi.getAge() + "\n"
        + "Weight: " + bmi.getWeight() + "\n"
        + "Height: " + bmi.getHeight() + "\n"
        + "BMI: " + bmi.getBMI() + " " + bmi.getStatus());
    }
}
