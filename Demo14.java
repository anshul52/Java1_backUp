//Q 12. & Q13.
//12- Accept the gender from the user as char and print the respective greeting message
//     Ex - Good Morning Sir (on the basis of gender)
//13- Extend the previous program and handle the wrong inputs.
//      Print Good Morning sir for input m or M & Good morning Maam for input F or f
//      else print Wrong Input
import java.util.Scanner;
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the gender");
        char gender = sc.next().charAt(0);

        if (gender == 'M' || gender == 'm') {
            System.out.println("good morning sir");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println(" good morning madam");
        } else {
            System.out.println(" invalid input");
        }
    }
}
