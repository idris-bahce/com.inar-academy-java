package chapters.chapter07.checkpoints;

public class CheckPoint7_24 {
    public static void main(String[] args) {
        double[] list = {3.4, 5, 3, 3.5, 2.2, 1.9, 2};
        selectionSort(list);
    }

    private static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin>list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        for (double a :
                list) {
            System.out.print(a + " ");
        }
    }
}
