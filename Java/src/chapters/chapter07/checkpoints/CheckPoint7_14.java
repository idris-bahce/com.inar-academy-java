package chapters.chapter07.checkpoints;

public class CheckPoint7_14 {
    public static void main(String[] args) {
        int[] myList;
        myList = new int[10];
        System.out.println(myList);
// Sometime later you want to assign a new array to myList
        myList = new int[20];
        System.out.println(myList);
        // we can see difference between their hash codes. they are in different heap areas.
    }
}
