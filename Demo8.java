
//Ques 5:accept length & width 0f rectangle. calculate and print the area & perimeter
import java.util.Scanner;
public class Demo8 {
    public static void main(String[ ] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length");
        int l = sc.nextInt();
        System.out.println("enter the width");
        int w = sc.nextInt();
        int area= (l*w);
        int perimeter= 2*(l+w);
        System.out.println("area is :" + area );
        System.out.println("perimeter is :"+ perimeter);
    }
}
