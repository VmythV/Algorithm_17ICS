package code;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author myth
 * @Date 2020-06-21 22:37
 */
public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        int N = cin.nextInt();
        for (int i = 0; i < N; i++) {
            set.add(cin.nextInt());
        }
        System.out.println(set.size());
        boolean first = true;
        for (Integer x : set) {
            if (first) {
                first = false;
            } else {
                System.out.print(" ");
            }
            System.out.print(x);
        }
    }
}