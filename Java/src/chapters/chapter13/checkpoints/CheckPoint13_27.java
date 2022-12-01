package chapters.chapter13.checkpoints;

public class CheckPoint13_27 {
    public static void main(String[] args) {
        Edible stuff = new Chicken();
        eat(stuff);
        stuff = new Duck();
        eat(stuff);
        stuff = new Broccoli();
        eat(stuff);
    }
    public static void eat(Edible stuff) {
        stuff.howToEat();
    }
}

interface Edible {
    public String howToEat();
}
class Chicken implements Edible {
    @Override
    public String howToEat() {
        return "Fry it";
    }
}
class Duck implements Edible {
    @Override
    public String howToEat() {
        return "Roast it";
    }
}
class Broccoli implements Edible {
    @Override
    public String howToEat() {
        return "Stir-fry it";
    }
}