package code;

import java.util.Scanner;

/**
 * @author myth
 * @Date 2020-06-20 23:48
 */
public class D {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        if (n<=3){
            System.out.println(String.format("%.2f",n*95));
        }else{
            System.out.println(String.format("%.2f",n*95*0.85));
        }
        cin.close();
    }
}
