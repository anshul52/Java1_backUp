//Q24.) Bijli Bill
public class Demo25 {
    public static void main(String[] args) {
        int units = 700;
        double amt = 0;
        if (units > 400) {
            amt = amt + (units - 400) * 13;
            units = 400;
            System.out.println(amt);
        }
        if (units > 200) {
            amt = amt + (units - 200) * 8;
            units = 200;
            System.out.println(amt);
        }
        if (units > 100) {
            amt = amt + (units - 100) * 6;
            units = 100;
            System.out.println(amt);
        }
        amt = amt + units * 4.2;
        System.out.println(amt);
    }
}





