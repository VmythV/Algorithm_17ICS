package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:47
 */
public class D {
    static int n;
    static int[] box;//盒子
    static int[] visited;//标识是否放入到盒子

    public static void dfs(int step) {
        if (step >= n) {
            for (int i = 0; i < n; i++) {
                System.out.print(box[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (visited[i] == 0) {
                box[step] = i;
                visited[i] = 1;
                dfs(step + 1);
                visited[i] = 0;//回溯
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        box = new int[n];
        visited = new int[n + 1];
        dfs(0);
    }
}
