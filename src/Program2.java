import java.util.Scanner;
/*
Write a program to check if a given number is odd or even.

 */
public class Program2 {
    public static void main (String[] args)
    {
        double a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        if(a%2==0)
        {
            System.out.println(a+"is a even number");
        }
        else {
            System.out.println(a+"is a odd number");
        }
    }
}
