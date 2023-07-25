//Ques 7- Accept the marks of Robert in three subjects
// Maths, Computer, English respectively (each out of 100 ),
//    Write a program to calculate his total marks and percentage marks.
import java.util.Scanner;
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter maths marks");
        float a = sc.nextFloat();
        System.out.println("enter computer marks");
        float b = sc.nextFloat();
        System.out.println("enter english marks");
        float c = sc.nextFloat();
        float total= (a+b+c);
        //int outoff=300;
        float percentage= (float)(total/3);
        System.out.println("total marks :" + total  );
        System.out.println("percentage :"+ percentage);
    }
}
