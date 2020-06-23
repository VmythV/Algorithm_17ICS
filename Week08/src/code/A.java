package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:32
 */
public class A {
    static long f[] = new long[500000];

    static {
        f[1] = 1;
        f[2] = 2;
        f[3] = 4;
        for (int i = 4; i < f.length; i++) {
            f[i] = (f[i - 1] + f[i - 2] + f[i - 3]) % 998244353;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        while (N-- > 0) {
            System.out.println(f[cin.nextInt()]);
        }
    }
}
