//Question 29.) Accept an integer and Print hello world n times

import java.util.Scanner;

public class Demo29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("hello world");
        }

    }
}
