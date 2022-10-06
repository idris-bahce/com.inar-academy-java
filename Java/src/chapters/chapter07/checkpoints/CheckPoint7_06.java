package chapters.chapter07.checkpoints;

public class CheckPoint7_06 {
    //we can reach by for loop or foreach
    public static void main(String[] args) {
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println("This is foreach");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }
        System.out.println("\nThis is for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
