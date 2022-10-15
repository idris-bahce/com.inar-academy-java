package chapters.chapter08.exercises;

public class Exercise8_03 {
    public static void main(String[] args) {
        char[][] answers = getTheArray();
        char[] key = getTheKey();
        int[][] whichStudentMadeHowMuch = getTheWhichStudentMadeHowMuch(key, answers);
        int[] sortedScores = new int[answers.length];
        int[] sortedStudents = new int[answers.length];
        sortBothStudentsAndScores(sortedStudents, sortedScores, whichStudentMadeHowMuch);
        for (int i = 0; i < sortedStudents.length; i++) {
            System.out.println(sortedStudents[i] + ". student made "
                    + sortedScores[i] + " of the questions true.");
        }
    }

    private static void sortBothStudentsAndScores(int[] sortedStudents, int[] sortedScores, int[][] whichStudentMadeHowMuch) {

        for (int i = 0; i < sortedScores.length; i++) {
            sortedScores[i] = whichStudentMadeHowMuch[i][1];
            sortedStudents[i] = whichStudentMadeHowMuch[i][0];
        }
        for (int i = 0; i < sortedScores.length - 1; i++) {
            for (int j = i + 1; j < sortedScores.length; j++) {
                if (sortedScores[i] > sortedScores[j]) {
                    int temp = sortedScores[i];
                    sortedScores[i] = sortedScores[j];
                    sortedScores[j] = temp;
                    int temp2 = sortedStudents[i];
                    sortedStudents[i] = sortedStudents[j];
                    sortedStudents[j] = temp2;
                }
            }
        }
    }

    private static int[][] getTheWhichStudentMadeHowMuch(char[] key, char[][] answers) {
        int[][] arrayOfCorrects = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
            int trueCounter = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    trueCounter++;
                }
            }
            arrayOfCorrects[i][0] = i + 1;
            arrayOfCorrects[i][1] = trueCounter;//this means i. student made "trueCounter" times true.
        }
        return arrayOfCorrects;
    }

    private static char[] getTheKey() {
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        return key;
    }

    private static char[][] getTheArray() {
        char[][] result = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        return result;
    }
}
