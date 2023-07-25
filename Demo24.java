//Q23).Shop discount
import java.util.Scanner;
public class Demo24 {
    public static void main(String[] args) {
        double amt = 5491;
        double disPer = 0;
        if (amt >= 5000 && amt <= 7000) {
            disPer = 10;
        } else if (amt >= 7000 && amt <= 10000) {
            disPer = 20;
        } else if (amt < 7000) {
            disPer = 30;
        }
        amt = amt * (1 - (disPer / 100)); //amt = amt - amt(disAmount/1000)
        System.out.println(amt);

    }
    }




//public class Demo24  {
//    public static void main(String[] args) {
//        int discountPer = 0;
//        Scanner sc = new Scanner(System.in);
//        int amount = sc.nextInt();
//
//        if(amount >=5001 && amount<=7000) {
//            discountPer = 10;
//        }
//        else if (amount>=7001 && amount<=10000) {
//            discountPer = 20;
//        }
//        else if (amount>10000) {
//            discountPer = 30;
//        }
//
//        amount = amount - ((amount * discountPer) /100);
//        System.out.println(amount);
//    }
//}