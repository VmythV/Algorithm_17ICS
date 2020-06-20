package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-20 23:37
 */
public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        System.out.println(String.format("%.3f", (a + b + c) * 1.0 / 3));
        cin.close();
    }
}
