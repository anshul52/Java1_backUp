//25.) INR Denomination
public class Demo26 {
    public static void main(String[] args) {
        int rs2000, rs500, rs200, rs100, rs50, rs20, rs10, rs5, rs2, rs1;
        int amt = 8751;
        int a = 1;
        if (a == 1)   //(amt>=2000)
             {
            rs2000 = amt / 2000;
            System.out.println("number of 2000 rs notes = " + rs2000);
            amt = amt % 200-0;
        }
        if (a == 1) {
            rs500 = amt / 500;
            System.out.println("number of 500 rs notes = " + rs500);
            amt = amt % 500;
        }
        if (a == 1) {
            rs200 = amt / 200;
            System.out.println("number of 200 rs notes = " + rs200);
            amt = amt % 200;
        }
        if (a == 1) {
            rs100 = amt / 100;
            System.out.println("number of 100 rs notes = " + rs100);
            amt = amt % 100;
        }
        if (a == 1) {
            rs50 = amt / 50;
            System.out.println("number of 50 rs notes = " + rs50);
            amt = amt % 50;
        }
        if (a == 1) {
            rs20 = amt / 20;
            System.out.println("number of 20 rs notes = " + rs20);
            amt = amt % 20;
        }
        if (a == 1) {
            rs10 = amt / 10;
            System.out.println("number of 10 rs notes = " + rs10);
            amt = amt % 10;
        }
        if (a == 1) {
            rs5 = amt / 5;
            System.out.println("number of 5 rs notes = " + rs5);
            amt = amt % 5;
        }
        if (a == 1) {
            rs2 = amt / 2;
            System.out.println("number of 2 rs notes = " + rs2);
            amt = amt % 2;
        }
        if (a == 1) {
            rs1 = amt / 1;
            System.out.println("number of 1 rs notes = " + rs1);
            amt = amt % 1;
        } else {
            System.out.println("invalid syntax");
        }
    }
}
