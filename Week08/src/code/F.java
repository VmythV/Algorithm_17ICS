package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:33
 */
public class F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            Matrix[][] arr = new Matrix[n + 1][n + 1];
            Matrix[] a = new Matrix[n + 1];
            int[][] dp = new int[n + 1][n + 1];
            for (int j = 1; j <= n; j++) {
                a[j] = new Matrix(cin.nextInt(), cin.nextInt());
            }
            for (int i = n; i >= 1; i--) {
                for (int j = i; j <= n; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                    if (i == j) {
                        arr[i][j] = a[i];
                        dp[i][j] = 0;
                    }
                    if (i < j) {
                        for (int k = i; k < j; k++) {
                            arr[i][j] = new Matrix(arr[i][k].w, arr[k + 1][j].h);
                            dp[i][j] = Math.min(dp[i][j], arr[i][k].w * arr[i][k].h * arr[k + 1][j].h + dp[i][k] + dp[k + 1][j]);
                        }
                    }
                }
            }
            System.out.println(dp[1][n]);
        }
    }

    private static class Matrix {
        int w;
        int h;

        Matrix(int w, int h) {
            this.w = w;
            this.h = h;
        }
    }
}
