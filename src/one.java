import java.sql.SQLOutput;
import java.util.Scanner;
/*
Write a program to check if a given number is Positive, Negative, or Zero.

 */
public class one {
    public static void main (String[] args)
    {
        double a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        if(a==0) {
            System.out.println("the number you entered is zero");
        } else if (a>=1) {
            System.out.println("the number you entered is a positive number");
        }
        else
        {
            System.out.println("the number you entered is a negative number ");
        }
    }
}
