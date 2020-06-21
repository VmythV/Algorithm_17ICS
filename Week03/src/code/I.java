package code;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:09
 */
public class I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
