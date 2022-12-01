package chapters.chapter13.checkpoints;

public class CheckPoint13_21 {
    public static void main(String[] args) {
        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(persons);//Person class is not implemented by comparable interface
    }
}
class Person{
    private int id;
    Person(int id) {
        this.id = id;
    }

}