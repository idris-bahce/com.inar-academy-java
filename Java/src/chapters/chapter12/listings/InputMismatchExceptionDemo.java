package chapters.chapter12.listings;

import java.util.*;

public class InputMismatchExceptionDemo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter an integer: ");
                int num = in.nextInt();
                System.out.println("The number entered is " + num);
                break;
            }
            catch (InputMismatchException i){
                System.out.println("Try again. (Incorrect input: an integer is required)");
                in.nextLine();
            }
        }
    }
}
