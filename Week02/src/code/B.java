package code;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 21:49
 */
public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        cin.close();
    }
}
