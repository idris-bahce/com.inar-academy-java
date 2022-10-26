package chapters.chapter09.listings;

public class TotalArea {
    public static void main(String[] args) {
        CircleWithPrivateDataFields[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    private static void printCircleArray(CircleWithPrivateDataFields[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("-------------------------------");
        System.out.printf("%-30s%-15f\n", "The total area of circles is",sum(circleArray));

    }

    private static double sum(CircleWithPrivateDataFields[] circleArray) {
        double sum = 0;

        for (int i = 0; i < circleArray.length; i++) {
            sum+=circleArray[i].getArea();
        }
        return sum;
    }

    private static CircleWithPrivateDataFields[] createCircleArray() {
        CircleWithPrivateDataFields[] circleArray = new CircleWithPrivateDataFields[5];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new CircleWithPrivateDataFields(Math.random() * 100);
        }
        return circleArray;
    }
}
