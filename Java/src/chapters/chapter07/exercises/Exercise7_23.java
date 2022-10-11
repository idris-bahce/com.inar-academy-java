package chapters.chapter07.exercises;

public class Exercise7_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100]; // true = open; false = closed;
        whichIsOpen(lockers);
        printTheOpenLockers(lockers);
    }

    public static void printTheOpenLockers(boolean[] lockers) {
        System.out.println("Oen lockers are: ");
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void whichIsOpen(boolean[] lockers) {
        for (int students = 1; students <= 100; students++) {
            for (int lockerNum = students-1; lockerNum < lockers.length; lockerNum+=students) {
                lockers[lockerNum]=!lockers[lockerNum];
            }
        }

    }
}
