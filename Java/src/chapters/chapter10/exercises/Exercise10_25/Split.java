package chapters.chapter10.exercises.Exercise10_25;

public class Split {
    public static void main(String[] args) {

    }
    public static String[] split(String s, String regex){
        int quantityCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == regex.charAt(0)){
                quantityCounter+=2;
            }
        }
        String[] strings = new String[quantityCounter];
        int indexEnd = -1;
        int indexBegin = 0;
        for (int i = 0; i < strings.length; i++) {
            if (s.charAt(i) == regex.charAt(0)){
                indexEnd = i;
            }

        }
        return null;
    }
}
