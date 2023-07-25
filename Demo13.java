// Question 11- Accept two numbers and print the greatest between them

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b)
        {
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }
    }
}
