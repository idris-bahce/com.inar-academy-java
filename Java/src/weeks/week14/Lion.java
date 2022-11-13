package weeks.week14;

public class Lion {
    private int tail;
    private int weight;
    private int height;
    private boolean hasSwimmingSkills;
    private boolean hasFlyingSkills;

    public Lion() {
        this(0,0,0,false,false);
    }

    public Lion(int tail, int weight, int height, boolean hasSwimmingSkills, boolean hasFlyingSkills) {
        this.tail = tail;
        this.weight = weight;
        this.height = height;
        this.hasSwimmingSkills = hasSwimmingSkills;
        this.hasFlyingSkills = hasFlyingSkills;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
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
