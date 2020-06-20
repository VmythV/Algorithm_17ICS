package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-20 23:50
 */
public class I {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int count = 0;
            while (n != 1) {
                if (n % 2 == 1) {
                    n = 3 * n + 1;
                } else {
                    n /= 2;
                }
                count++;
            }
            System.out.println(count);
        }
        cin.close();
    }
}
