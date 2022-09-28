package chapters.chapter06.checkpoints06;

public class CheckPoint6_09 {

    public static void method1(int n, int m){
        n +=m;
        method2(3.4);
    }
    public static double method2(double n){
        if(n>0)
            return 1;
        else if (0 == n) {
            return 0;
        }else
            return -1;
    }
}
