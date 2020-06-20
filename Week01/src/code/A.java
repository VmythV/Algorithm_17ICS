package code;

/**
 * @author myth
 * @Date 2020-06-20 23:35
 */

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double r = cin.nextDouble();
        double h = cin.nextDouble();
        System.out.println(String.format("Area=%.3f", (Math.PI * r * r) * 2 + (2 * Math.PI * r) * h));
        cin.close();
    }
}
