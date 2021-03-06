package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 19:34
 */
public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int nv = cin.nextInt();//1~nv
        int ne = cin.nextInt();
        int[] D = new int[nv + 1];
        for (int i = 1; i <= ne; i++) {
            int x = cin.nextInt();
            int y = cin.nextInt();
            D[x]++;
            D[y]++;
        }
        int from = cin.nextInt();
        int to = cin.nextInt();
        if (from == to) {//欧拉环
            boolean flag = true;
            for (int i = 1; i <= nv; i++) {
                if (D[i] % 2 == 1) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        } else {//欧拉路径
            boolean flag = D[from] % 2 == 1 && D[to] % 2 == 1;
            for (int i = 1; i <= nv; i++) {
                if (i == from || i == to) {
                    continue;
                }
                if (D[i] % 2 == 1) {
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "YES" : "NO");
        }

    }
}
