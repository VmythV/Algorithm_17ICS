package code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 22:24
 */
public class H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Double> man = new ArrayList<>();
        ArrayList<Double> woman = new ArrayList<>();
        int n = cin.nextInt();
        while (n-- > 0) {
            String sex = cin.next();
            double high = cin.nextDouble();
            if (sex.equals("male")) {
                man.add(high);
            } else if (sex.equals("female")) {
                woman.add(high);
            }
        }
        Collections.sort(man);
        Collections.sort(woman, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) Math.floor(o2 - o1);
            }
        });
        for (Double a : man) {
            System.out.print(String.format("%.2f", a) + " ");
        }
        for (Double a : woman) {
            System.out.print(String.format("%.2f", a) + " ");
        }
    }
}
