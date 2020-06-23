package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-23 18:34
 */
public class G {
    private static int[] A = {1, 2, 4, 5, 10};

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int N = cin.nextInt();
        int[] arr = new int[N + 1];
        arr[0] = 0;
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.MAX_VALUE;
            for (int value : A) {
                if (i >= value && arr[i - value] != arr[i]) {
                    arr[i] = Math.min(arr[i - value] + 1, arr[i]);
                }
            }
        }
        System.out.println(arr[N]);
    }
}

