//28.) Accept two numbers from user and swap their values
// Part 2 - Swap without using third variable
import java.util.Scanner;
public class Demo28L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
