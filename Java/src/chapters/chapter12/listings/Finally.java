package chapters.chapter12.listings;

import java.io.IOException;

public class Finally {
    public static void main (String[] args) {
        try {
            int b = 1 / 0;
        } finally {
            System.out.println("abc");
        }
    }
}
