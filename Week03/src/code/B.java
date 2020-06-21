package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:07
 */
public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String A = cin.next();
            StringBuilder str = new StringBuilder(cin.next());
            int N = Integer.parseInt(A) + Integer.parseInt(str.reverse().toString());
            System.out.println(N);
        }
    }
}