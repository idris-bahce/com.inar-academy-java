package chapters.chapter09.exercises.Exercise9_06;

public class TestStopwatch {
    public static void main(String[] args) {
        int[] arr = createArray();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        java.util.Arrays.sort(arr);
        stopWatch.stop();
        System.out.println("Millisecond of the process is: " + stopWatch.getElapsedTime());
    }

    private static int[] createArray() {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }
        return arr;
    }
}
