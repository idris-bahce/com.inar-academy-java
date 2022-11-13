package weeks.week14;

public class Test {
    public static void main(String[] args) {
        Bus bus = new Bus("Mercedes","benz",8,2010,"white",true,true,false,48);
        bus.accelerate();
        System.out.println(bus.toString());
    }
}
