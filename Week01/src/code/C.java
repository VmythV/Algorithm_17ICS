package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-20 23:48
 */
public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        long n = cin.nextLong();
        System.out.println(((1 + n) * n) / 2);
        cin.close();
    }
}
