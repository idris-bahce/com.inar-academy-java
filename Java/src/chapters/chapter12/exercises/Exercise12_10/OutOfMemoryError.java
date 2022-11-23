package chapters.chapter12.exercises.Exercise12_10;


public class OutOfMemoryError {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            try {
                int[] arr = new int[500_000_000];

            }catch (java.lang.OutOfMemoryError out){
                System.err.println("Your entry is so much for your memory. Please enter smaller integer.");
            }
        }
    }
}
