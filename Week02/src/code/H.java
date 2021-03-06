package code;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-21 21:52
 */
public class H {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(Fibonacci(n-1));
        cin.close();
    }

    private static BigInteger Fibonacci(int n) {
        BigInteger a1=new BigInteger("1");
        BigInteger a2=new BigInteger("2");
        BigInteger a3=new BigInteger(n+"");
        for(int i=3;i<=n;i++) {
            a3 = a1.add(a2);
            a1=a2;
            a2=a3;
        }
        return a3;
    }
}
