package chapters.chapter08.listings;

public class GradeExam {
    public static void main(String[] args) {
        char[][] answers = getTheArray();
        char[] key = getTheKey();
        printFullyMadeStudents(answers,key);

    }

    private static void printFullyMadeStudents(char[][] answers, char[] key) {


        for (int row = 0; row < answers.length; row++) {
            int trueCounter = 0;
            for (int column = 0; column < answers[row].length; column++) {
                if (answers[row][column] == key[column]){
                    trueCounter++;
                }
            }System.out.println((row + 1) + ". student made " + trueCounter + " of the questions correct.");
        }
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
