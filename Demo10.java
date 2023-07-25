//8- Write a program to accept temperature in Fahrenheit & convert into Celsius.
import java.util.Scanner;
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fahrenheit , celsius;
        System.out.println("enter fahrenheit number :");
        fahrenheit =sc.nextFloat();
        celsius = (float)((fahrenheit-32)*0.55555);
        System.out.println(celsius);
    }
}
