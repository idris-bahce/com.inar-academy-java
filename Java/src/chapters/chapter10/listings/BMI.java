package chapters.chapter10.listings;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI() {
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        double bmi = weight / (height * height);
        return bmi;
    }
    public String getStatus(){
        if (getBMI()<20){
            return (this.getName() + ",you are underweight.");
        } else if (getBMI() > 20 && getBMI() < 25) {
            return (this.getName() + ",your weight is normal.");
        }else {
            return (this.getName() +",you are overweight.");
        }
    }
}
