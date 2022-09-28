package chapters.chapter06.listings06;

public class TestMax {
    public static int max (int num1, int num2){
        int result = 0;
        if (num1 > num2){
            result=num1;
        }else {
            result=num2;
        }
        return result;
    }
}
