package chapters.chapter12.checkpoints;

public class CheckPoint12_20 {
    public static void main(String[] args) {

    }
    public void m(int value) throws Exception{
        if (value < 40)
            throw new Exception("value is too small");
    }
}
