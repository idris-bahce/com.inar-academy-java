package chapters.chapter06.listings06;

public class FirsSimpleMethod {
    public static void main(String[] args) {
        System.out.println(sum(1,10));
        System.out.println(sum(20,37));
        System.out.println(sum(35,49));

    }
    public static int sum(int a , int b){
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum+=i;
        }
        return sum;
    }
}
