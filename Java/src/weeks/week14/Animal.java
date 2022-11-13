package weeks.week14;

public class Animal {
    private String  name;
    private int weight;
    private int height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;


    public Animal() {
        this("default",0,0,false,false);
    }

    public Animal(String name, int weight, int height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isHasSwimmingSkills() {
        return hasSwimmingSkills;
    }

    public void setHasSwimmingSkills(boolean hasSwimmingSkills) {
        this.hasSwimmingSkills = hasSwimmingSkills;
    }

    public boolean isHasFlyingSkills() {
        return hasFlyingSkills;
    }

    public void setHasFlyingSkills(boolean hasFlyingSkills) {
        this.hasFlyingSkills = hasFlyingSkills;
    }
    public void runs(){
        System.out.println("It is running.");
    }
    public void eats(){
        System.out.println("It is eating.");
    }
    public void sleeps(){
        System.out.println("It is sleeping.");
    }
}
