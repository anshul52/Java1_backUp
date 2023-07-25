//Q20.

import java.util.Scanner;

public class Demo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, s, p;
        System.out.println("enter no. a");
        a = sc.nextDouble();
        System.out.println("enter no. b");
        b = sc.nextDouble();
        System.out.println("enter no. c");
        c = sc.nextDouble();

        s = Math.max(a, b);
        //p = Math.max(b, c);
        System.out.println(Math.max(s,c));
    }
}