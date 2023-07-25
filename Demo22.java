//Q21.)  Accept a year and check if it a leap year or not

//import java.util.Scanner;
//public class Demo22 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int  a;
//        System.out.println("enter no. a");
//        a = sc.nextInt();
//
//        if (a%4==0 && a%400==0 || a%100 !=0)
//        {
//            System.out.println("a leap year");
//        }
//        else
//        {
//            System.out.println("not a leap year");
//        }
//    }
//}








import java.util.Scanner;
public class Demo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  a;
        System.out.println("enter no. a");
        a = sc.nextInt();

        boolean leapYear = false;

        if(a % 4 == 0)
        {
            leapYear = true;
        }
        else if (a % 4 == 0)
        {
            if(a % 100 == 0)
            {
                leapYear = true;
            }
        }
    }
}
