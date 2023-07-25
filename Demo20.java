//Q19.
import java.util.Scanner;
public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("enter value of a in b/w  (1 to 7)");
        a = sc.nextInt();
        if(1==a) 
        { System.out.println("monday"); }
        else if (2==a)
        { System.out.println("tuesday"); }
        else if (3==a)
        { System.out.println("wednesday"); }
        else if (4==a)
        { System.out.println("thursday"); }
        else if (5==a)
        { System.out.println("friday"); }
        else if (6==a)
        { System.out.println("saturday"); }
        else if (7==a)
        { System.out.println("sunday"); }
        else
        { System.out.println("you have entered a unvalid number"); }
    }
}
