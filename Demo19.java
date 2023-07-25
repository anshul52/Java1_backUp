//Q18.
import java.util.Scanner;
public class Demo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double root1 , root2;
        System.out .println("enter value of a");
        a = sc.nextDouble();
        System.out.println("enter value of b");
        b = sc.nextDouble( );
        System.out.println("enter value of c");
        c = sc.nextDouble( );

        //double s = Math.sqrt(b);
        //double p = Math.sqrt(s-(4*(a*c)));
        root1 = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
        root2 = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
        System.out.println(root1);
        System.out.println(root2);
    }
}
