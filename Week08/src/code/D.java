package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:32
 */
public class D {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int n = cn.nextInt();
        int[] a = new int[n];
        int k = 0;
        for (int i = 2; i <= n; i++) {
            if (Prime(i)) {
                a[k] = i;
                k++;
            }
        }
        int count = 0;
        for (int i = 0; i < k - 1; i++) {
            if (a[i + 1] - a[i] <= 2) {
                count++;
            }
        }
        System.out.println(count);
        cn.close();
    }

    private static boolean Prime(int i) {
        if (i == 2) {
            return true;
        }
        if (i % 2 == 0 || i < 2) {
            return false;
        }
        int m = (int) Math.sqrt(i);
        for (int c = 3; c <= m; c += 2) {
            if (i % c == 0) {
                return false;
            }
        }
        return true;

    }
}
