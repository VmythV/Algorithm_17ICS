package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:23
 */
public class D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        int[] f = new int[m];
        int[] g = new int[n];
        for (int i = 0; i < f.length; i++) {
            f[i] = cin.nextInt();
        }
        for (int i = 0; i < g.length; i++) {
            g[i] = cin.nextInt();
        }
        int min = Math.abs(f[0] - g[0]);
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < g.length; j++) {
                if (Math.abs(f[i] - g[j]) < min) {
                    min = Math.abs(f[i] - g[j]);
                }
            }
        }
        System.out.println(min);
    }
}
