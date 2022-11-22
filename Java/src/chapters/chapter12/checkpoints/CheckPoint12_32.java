package chapters.chapter12.checkpoints;

public class CheckPoint12_32 {
    public static void main(String[] args) throws Exception {
        try (java.io.PrintWriter output = new java.io.PrintWriter("temp.txt")) {
            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", (1 > 2));
            output.printf("%6s\r\n", "Java");
        }
    }
}
