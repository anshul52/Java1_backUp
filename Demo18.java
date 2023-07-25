//Q17.)
import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, a, b, c ,s;
        System.out.println("enter length of side a");
        a = sc.nextDouble();
        System.out.println("enter length of side b");
        b = sc.nextDouble();
        System.out.println("enter length of side c");
        c = sc.nextDouble();

        s = (a+b+c)/2;
        A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(A);
    }
}