//Ques 4:accept 2 integer  from user and print the sum
import java.util.Scanner;
public class Demo7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter ur age");
        int  b = sc.nextInt();
        System.out.println("enter ur name: ");
        sc.nextLine();
        String a = sc.nextLine();
        System.out.println("your name is " + a + " and your age is " + b );

    }
}
//java.lang: qa is a default package