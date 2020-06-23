package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 19:34
 */
public class B {
    static Scanner cin = new Scanner(System.in);
    static int[] bin = new int[1002];

    public static void main(String[] args) {
        while (cin.hasNext()) {
            int n, m;
            int x, y, count = 0;
            n = cin.nextInt();
            m = cin.nextInt();
            if (n == 0 && m == 0) {
                return;
            }
            for (int i = 1; i <= n; i++) {
                bin[i] = i;
            }
            for (int j = 0; j < m; j++) {
                x = cin.nextInt();
                y = cin.nextInt();
                merge(x, y);
            }
            for (int i = 1; i <= n; i++) {
                if (bin[i] == i) {
                    count++;
                }
            }
            System.out.println(count - 1);
        }
    }

    static int findx(int x) {
        int r = x;
        while (bin[r] != r) {
            r = bin[r];
        }
        return r;
    }

    static void merge(int x, int y) {
        int fx, fy;
        fx = findx(x);
        fy = findx(y);
        if (fx != fy) {
            bin[fx] = fy;
        }
    }
}