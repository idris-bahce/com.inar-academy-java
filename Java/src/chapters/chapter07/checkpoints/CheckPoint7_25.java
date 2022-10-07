package chapters.chapter07.checkpoints;

public class CheckPoint7_25 {
    public static void main(String[] args) {
        double[] list = {1,2,3,4,5,6};
        selectionSortDecreasing(list);
    }

    public static void selectionSortDecreasing(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMax = list[i];
            int currentMaxIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMax<list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex!=i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
        for (double a :
                list) {
            System.out.print(a + " ");
        }
    }
}
