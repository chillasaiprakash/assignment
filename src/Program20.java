import java.util.Scanner;

public class Program20 {
/*
Write a program that displays a menu with options 1. Add 2. Sub Based on the options
chosen, read 2 numbers and perform the relevant operation. After performing the
operation, the program should ask the user if he wants to continue. If the user presses y
or Y, then the program should continue displaying the menu else the program should
terminate.
Do While
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int result;
            if (choice == 1) {
                result = num1 + num2;
            } else if (choice == 2) {
                result = num1 - num2;
            } else {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue (Y/N)? ");
            char ch = scanner.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                continue;
            } else {
                break;
            }
        } while (true);

        scanner.close();
    }
}
