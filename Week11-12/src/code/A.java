package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 19:34
 */
public class A {
    static int n;
    static int[] F;

    static void init() {
        F = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            F[i] = i;
        }
    }

    static boolean union(int x, int y) {
        int fx = find(x);
        int fy = find(y);
        if (fx == fy) {
            return false;
        }
        F[fx] = fy;
        return true;
    }

    static int find(int x) {
        return x == F[x] ? x : (F[x] = find(F[x]));
    }

    static int count() {
        int tot = 0;
        for (int i = 1; i <= n; i++) {
            if (i == F[i]) {
                ++tot;
            }
        }
        return tot;
    }

    public static void main(String[] args) {
        n = cin.nextInt();
        init();
        int m = cin.nextInt();
        while (m-- > 0) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            union(x, y);
        }
        System.out.println(count());
    }

    static Scanner cin = new Scanner(System.in);
}
