package chapters.chapter09.exercises.Exercise9_04;

import java.util.Random;

public class Exercise9_04 {
    public static void main(String[] args) {
        Random random = new Random(100);
        for (int i = 0; i < 50; i++) {
            System.out.printf("%3d",random.nextInt(100));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
