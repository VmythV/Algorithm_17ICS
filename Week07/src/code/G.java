package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:39
 */
public class G {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int t[] = {100, 50, 10, 5, 2, 1};
            int sum = 0;
            int a;
            for (int i = 0; i < n; i++) {
                a = sc.nextInt();
                int b = 0;
                for (int j = 0; j < t.length; j++) {
                    b = a / t[j] + b;
                    a = a % t[j];
                    if (a == 0) {
                        break;
                    }
                }
                sum += b;
            }
            System.out.println(sum);
        }
    }
}
