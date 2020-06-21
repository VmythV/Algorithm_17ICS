package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:38
 */
public class F {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        Changemoney(a);
    }

    public static void Changemoney(int money) {
        int[] value = {100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < value.length; i++) {
            while (money >= value[i]) {
                System.out.println(value[i]);
                money -= value[i];
            }
        }
    }
}
