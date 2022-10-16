package chapters.chapter07.exercises;

public class Exercise7_10 {
    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for (double a :
                arr) {
            System.out.print(a + " ");
        }
        System.out.println("\nThe smallest index in the given conditions is: " + indexOfSmallestElement(arr));

    }
    public static int indexOfSmallestElement(double[] array){
        double min = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min&&array[i]>1){
                return i;
            }
        }
        return -1;
    }
}
