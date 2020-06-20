package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-20 23:49
 */
public class F {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
