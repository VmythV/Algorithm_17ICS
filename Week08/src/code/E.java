package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:33
 */
public class E {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int T = cin.nextInt();
        while (T-- > 0) {
            int N = cin.nextInt();
            int sum = 0, max = -101;
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = cin.nextInt();
            }
            for (int i = 0; i < N; i++) {
                sum += arr[i];
                if (sum > max) {
                    max = sum;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            System.out.println(max);
        }
        cin.close();
    }
}
