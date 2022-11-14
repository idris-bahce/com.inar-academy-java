package chapters.chapter10.exercises.Exercise10_25;

public class Split {
    public static void main(String[] args) {
        String s = "a?b?gf#eads?ad?";
        String reg = "[#?]";
        String[] arr = split(s,reg);
        printArray(arr);
    }

    private static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static String[] split(String s, String regex) {
        char[] regexSequence = getTheRegexSequence(regex);
        int size = getTheSize(regexSequence,s);
        String[] split = new String[size];
        java.util.Arrays.fill(split,"");
        putCharactersInSplitArray(split,s,regexSequence);
        return split;
    }

    private static void putCharactersInSplitArray(String[] split, String s, char[] regexSequence) {
        int splitIndex = 0;
        int elseCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isInRegex(regexSequence, ch)){
                split[splitIndex] += s.charAt(i);
                splitIndex++;
                elseCounter = 0;
            }else {
                if (elseCounter == 0) {
                    splitIndex++;
                }
                split[splitIndex - 1] += s.charAt(i);
                elseCounter++;
            }
        }
    }

    private static int getTheSize(char[] regexSequence, String s) {
        int size = 0;
        int elseCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isInRegex(regexSequence, ch)){
                size++;
                elseCounter = 0;
            }else {
                if (elseCounter == 0) size++;
                elseCounter++;
            }
        }
        return size;
    }

    private static boolean isInRegex(char[] regexSequence, char ch) {
        for (int i = 0; i < regexSequence.length; i++) {
            if (regexSequence[i] == ch){
                return true;
            }
        }
        return false;
    }

    private static char[] getTheRegexSequence(String regex) {
        if (regex.length() > 1) {
            if (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']') {
                char[] ch = new char[regex.length() - 2];
                for (int i = 1; i < regex.length() - 1; i++) {
                    ch[i - 1] = regex.charAt(i);
                }
                return ch;
            } else System.exit(0);
        }
        char ch = regex.charAt(0);
        char[] chars = {ch};
        return chars;
    }

}
