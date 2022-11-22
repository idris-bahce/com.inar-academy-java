package chapters.chapter12.checkpoints;

public class CheckPoint12_22 {
    public static void main(String[] args) {
        if (isNumeric("1.5")){
            System.out.println("True");
        }else
            System.out.println("false");
    }
    public static boolean isNumeric(String token) {
        boolean isAllNumeric = false;
        int counterOfPoint = 0;
        for (int i = 0; i < token.length(); i++) {
            if ('0'<=token.charAt(i)&&token.charAt(i)<='9'||token.charAt(i)=='.') {
                if (token.charAt(i) == '.')
                    counterOfPoint++;
                if (counterOfPoint>1)
                    return false;
                isAllNumeric = true;
            }else
                return false;
        }
        if (isAllNumeric)
            return true;
        return false;
    }
}
