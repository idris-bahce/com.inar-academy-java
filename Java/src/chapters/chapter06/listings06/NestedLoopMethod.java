package chapters.chapter06.listings06;

public class NestedLoopMethod {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (nested(i)){
                break;
            }
        }
    }
    public static boolean nested (int i){
        for (int j = 0; j < 10; j++) {
            if (i * j >50){
                return true;
            }
            System.out.println("i: " + i + " j: " + j + " i * j: " + (i * j));
        }
        return false;
    }
}
