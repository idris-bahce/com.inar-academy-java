package chapters.chapter07.exercises;
//Unfinished
import java.util.Scanner;

public class Exercise7_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of balls to drop: ");
        int balls = in.nextInt();

        System.out.println("Enter the number of slots in the bean machine: ");
        int slotNum = in.nextInt();

        int[] slots = new int[slotNum];
        String[] fallSequence = getTheFallSequence(balls, slotNum);
        for (int i = 0; i < fallSequence.length; i++) {
            System.out.println(fallSequence[i]);
        }
        printTheSlots(slots, fallSequence, balls, slotNum);

    }


    public static void printTheSlots(int[] slots, String[] fallSequence, int balls, int slotNum) {

        slots = getTheSlotsStuation(slots, fallSequence, slotNum);
        int maxOfSlotsArray = getTheMaxElement(slots);
        for (int i = 0; i < maxOfSlotsArray; i++) {//This is our row
            for (int j = 0; j < slots.length; j++) {//this is our column
                if (slots[j] > 0) {
                    System.out.print(0);
                    slots[j]--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static int getTheMaxElement(int[] slots) {
        int max = -1;
        for (int i = 0; i < slots.length; i++) {
            if (max < slots[i])
                max = slots[i];
        }
        return max;
    }

    private static int[] getTheSlotsStuation(int[] slots, String[] fallSequence, int slotNum) {
        for (int i = 0; i < fallSequence.length; i++) {
            int rightCounter = 0;
            //we use slotNum-1, because we are going to analyze each fall to understand where the ball falls
            for (int j = 0; j < slotNum - 1; j++) {
                char ch = fallSequence[i].charAt(j);
                if (ch == 'R') {
                    rightCounter++;
                }
            }
            slots[rightCounter]++;
        }
        return slots;
    }

    public static String[] getTheFallSequence(int balls, int slotNum) {
        String[] sequence = new String[balls];
        for (int i = 0; i < balls; i++) {
            String rightLeftSequence = "";
            for (int j = 0; j < slotNum - 1; j++) {//we extract one from Slot num because a ball confront slot - 1 times to a nail
                int rightOrLeft = (int) (Math.random() * 2);
                if (rightOrLeft == 0) {
                    rightLeftSequence += "L";
                } else {
                    rightLeftSequence += "R";
                }
            }
            sequence[i] = rightLeftSequence;
        }
        return sequence;
    }
}
