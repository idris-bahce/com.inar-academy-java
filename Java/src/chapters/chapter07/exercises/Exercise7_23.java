package chapters.chapter07.exercises;

public class Exercise7_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        for (int j = 0; j < lockers.length; j++) {//student 1
            lockers[j] = true;
        }
        for (int j = 1; j < lockers.length; j++) {//student 2
            lockers[j] = false;
        }
        for (int i = 1; i < lockers.length; i++) {//student 3 and so on...
            for (int j = i + 1; j < lockers.length; j++) {
                if (j %( i + 2) == 0){
                    if (!lockers[i]) {
                        lockers[i] = true;
                    }else {
                        lockers[i] = false;
                    }
                }
            }
        }
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print(i + " ");;
            }
        }
    }

}
