package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:47
 */
public class C {
    static int[] a = new int[21];
    static boolean used[] = new boolean[21];
    static int n;
    static int tot = 0;
    static boolean flag = false;

    static {
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }
    }

    static void dfs(int k) {
        if (flag) {
            return;
        }
        if (k == n) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                if (used[i]) {
                    sum += a[i];
                }
            }
            if (sum == tot) {
                flag = true;
            }
            return;
        }
        used[k] = false;
        dfs(k + 1);
        used[k] = true;
        dfs(k + 1);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            n = cin.nextInt();
            flag = false;
            tot = 0;
            for (int i = 0; i < n; i++) {
                a[i] = cin.nextInt();
                tot += a[i];
            }
            if (tot % 2 == 0) {
                tot /= 2;
                dfs(0);
            }
            if (flag) {
                System.out.println("Of course,I can!");
            } else {
                System.out.println("Sorry,I can't!");
            }
        }
    }
}
