package weeks.week13;

public class TestHome {
    public static void main(String[] args) {
        Home home = new Home();
        home.print();

        Home home1 = new Home(120,2,5,true,
                250000,"south",2022);
        home1.print();
    }
}
