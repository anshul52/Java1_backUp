//27.) Accept an english alphabet from user and check if it is a consonent or a vowel
import java.util.Scanner;
public class Demo27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter a character");
        char ch = sc.next( ).charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonent");
        }
    }
}
