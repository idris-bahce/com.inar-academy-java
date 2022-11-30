package chapters.chapter13.listings;

import java.math.BigInteger;

public class SortComparableObjects {
    public static void main(String[] args) {
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + " ");
        }
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
                 new BigInteger("432232323239292"),
                 new BigInteger("54623239292")};
         java.util.Arrays.sort(hugeNumbers);

        for (BigInteger nums :
                hugeNumbers) {
            System.out.print(nums + " ");
        }
    }
}
