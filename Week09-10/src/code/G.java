package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:47
 */
public class G {
    static int n;
    static int r;
    static int[] a = new int[12];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        r = cin.nextInt();
        dfs(n, r);
    }

    private static void dfs(int top, int v) {
        int i;
        if (v == 0) {
            for (i = r; i > 0; i--) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        for (i = top; i >= v; --i) {
            a[v] = i;
            dfs(i - 1, v - 1);
        }
    }
}
