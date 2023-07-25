//Q15.
import java.util.Scanner;
public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter ur name");
        String a = sc.nextLine();
        System.out.println("enter ur age");
        int b = sc.nextInt();
        if (b >= 18) {
            System.out.println("Hello " + a + " You are a valid voter");
        } else {
            System.out.println(" Sorry Shery, you can't cast the vote");
            System.out.println("after " + (18 - b) + " many years you will be eligible");
        }
    }
}

//ctrl + alt +l : to organize our code
