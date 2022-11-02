package chapters.chapter10.listings;

public class UseBMI {
    public static void main(String[] args) {
        BMI bmi = new BMI("idris",26,98,1.91);
        System.out.println("The BMI for "+ bmi.getName() + " is" +bmi.getBMI() + bmi.getStatus());

        BMI bmi1 = new BMI("Kim Yang", 18, 65.77089365, 1.778);
         System.out.println("The BMI for " + bmi1.getName() + " is "
                 + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 97.52235955, 1.778);
         System.out.println("The BMI for " + bmi2.getName() + " is "
                 + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
