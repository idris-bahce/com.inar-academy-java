package chapters.chapter10.exercises.Exercise10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isEven(){
        return (this.value % 2 == 0);
    }
    public boolean isOdd(){
        return (this.value % 2 == 1);
    }
    public boolean isPrime(){
        if (value == 0 || value == 1)
            return false;
        else if (value == 2)
            return true;
        else
            for (int n = 3; n < value/2; n++) {
                if (value % n == 0)
                    return false;
            }

        return true;
    }
    public static boolean isEven(int value){
        return (value % 2 == 0);
    }
    public static boolean isOdd(int value){
        return (value % 2 == 1);
    }
    public static boolean isPrime(int value){
        if (value == 0 || value == 1)
            return false;
        else if (value == 2)
            return true;
        else
            for (int n = 3; n < value/2; n++) {
                if (value % n == 0)
                    return false;
            }

        return true;
    }
    public static boolean isEven(MyInteger value){
        return value.isEven();
    }
    public static boolean isOdd(MyInteger value){
        return value.isOdd();
    }
    public static boolean isPrime(MyInteger value){
        return value.isPrime();
    }
    public boolean equals(int value){
        return  (this.value == value);
    }
    public boolean equals(MyInteger value){
        return equals(value.value);
    }

    public static int parseInt(char[] chars){
        String num = "";
        for (int i = 0; i < chars.length; i++) {
            num += "" + chars[i];
        }
        return parseInt(num);
    }
    public static int parseInt(String str){
        int num = 0;
        int digit;
        for (int i = str.length()-1,p=0; i >= 0;p++ ,i--) {
            digit = (str.charAt(i) - '0');
            num += Math.pow(10,p) * digit;
        }
        return num;
    }
}
