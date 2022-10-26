package chapters.chapter09.checkpoints;

public class CheckPoint9_23 {
    //while we are passing a primitive type we pass value. But in the case of reference of an object we just pass reference.
    //Which is in heap and doesn't end when method ends.
    public static void main(String[] args) {
        Count myCount = new Count();
        int times = 0;
        for (int i = 0; i < 100; i++)
            increment(myCount, times);
        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);
    }

    public static void increment(Count c, int times) {
        c.count++;
        times++;
    }
}

class Count {
    public int count;

    public Count(int c) {
        count = c;
    }

    public Count() {
        count = 1;
    }
}
