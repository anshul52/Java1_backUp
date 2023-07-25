//Question 30.) Print natural number up to n.

import java.util.Scanner;

public class Demo30 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
}

