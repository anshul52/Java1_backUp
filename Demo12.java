//Question 10- Take 3 int inputs from user and check and print the result.
//	all are equal
//	any of two are equal
//	( use && || )
import java.util.Scanner;
public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println( a==b && b==a);
        System.out.println(a==b || b==c || c==a);
    }
}
