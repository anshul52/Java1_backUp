//16- Accept the parameters and calculate the Compound Interest
// & print it on STDOUT (Use Math class methods)
import java.util.Scanner;
public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, P, r, n ,t;
        System.out.println("enter principle amount:");
        P = sc.nextInt();
        System.out.println("enter rate of intrest:");
        r = sc.nextInt();
        System.out.println("enter number of times intrest is compounding per unit :");
        n = sc.nextInt();
        System.out.println("enter time period:");
        t = sc.nextInt();

        double amount = P*Math.pow(1+(r/n),n*t);
        double compIntrest = amount -P;
        System.out.println("Compound Interest after "+t+" years :" +compIntrest);
        System.out.println("amount after "+ t + " years "+amount);


    }
}
