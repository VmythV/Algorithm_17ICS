package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 19:34
 */
public class I {
    static int n;
    static int[][] D;
    static boolean[] vis;
    static int best;
    static int[] a;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        D = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                D[i][j] = cin.nextInt();
            }
        }
        vis = new boolean[n];
        a = new int[n];
        best = Integer.MAX_VALUE;
        vis[0] = true;
        a[0] = 0;
        dfs(1);
        System.out.println(best);
    }

    private static void dfs(int k) {
        if (n == k) {
            int tot = 0;
            for (int i = 0; i < n; i++) {
                tot += D[a[i]][a[(i + 1) % n]];
            }
            best = Math.min(best, tot);
            return;
        }
        int tot = 0;
        for (int j = 0; j < k - 1; j++) {
            tot += D[a[j]][a[(j + 1) % n]];
        }
        for (int i = 1; i < n; i++) {
            if (vis[i]) {
                continue;
            }
            if (tot + D[a[k - 1]][i] >= best) {
                continue;
            }
            vis[i] = true;
            a[k] = i;
            dfs(k + 1);
            vis[i] = false;
        }
    }
}
