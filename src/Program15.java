import java.util.Scanner;

public class Program15 {
    /*Write a program to add all the values in a given number and print. Ex: 1234->10
    Using for loop
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            sum += digit;
        }

        System.out.println("Sum of digits = " + sum);
    }
}

