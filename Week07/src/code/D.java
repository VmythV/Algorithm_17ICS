package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:37
 */
public class D {
    static Scanner cin = new Scanner(System.in);

    static public void main(String[] args) {
        while (cin.hasNext()) {
            int a = 100 * cin.nextInt();
            int b = cin.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            for (int i = 0; i < 100; i++) {
                if ((a + i) % b == 0) {
                    if (i < 10) {
                        System.out.printf("0");
                    }
                    System.out.printf("%d ", i);
                }
            }
            System.out.printf("\n");
        }

    }
}
