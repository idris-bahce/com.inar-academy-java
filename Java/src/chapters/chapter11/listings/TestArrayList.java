package chapters.chapter11.listings;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("London");
        cityList.add("Denver");
        cityList.add("Paris");
        cityList.add("Miami");
        cityList.add("Seoul");
        cityList.add("Tokyo");

        System.out.println("List size? " + cityList.size()
        + "\nIs Miami in the list? " + cityList.contains("Miami")
        + "\nThe location of Denver in the list? " + cityList.indexOf("Denver")
        + "\nIs the list empty? " + cityList.isEmpty());

        cityList.add(2,"Xian");
        cityList.remove("Miami");
        cityList.remove(1);

        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();

        ArrayList<Circle> circleArrayList = new ArrayList<>();

        circleArrayList.add(new Circle(2));
        circleArrayList.add(new Circle(3));

        System.out.println("The area of the first circle is: " + circleArrayList.get(0).getArea()
        + "\nThe area of the second circle is: " + circleArrayList.get(1).getArea());

    }
}
