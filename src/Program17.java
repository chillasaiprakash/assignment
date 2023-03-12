import java.util.Scanner;

public class Program17 {
    /*
    Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
I/P:1004 O/P:4001
While Loop

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number = " + reversedNum);
    }
}
