import java.util.Scanner;

public class Program12 {
    /*
    Write a program to check if a given number is prime or not
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }


            if (prime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }




