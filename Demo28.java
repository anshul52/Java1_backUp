//28.) Accept two numbers from user and swap their values

import java.util.Scanner;
public class Demo28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = a;
        a = b ;
        b = t ;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}