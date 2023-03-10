import java.util.Scanner;
/*
Write a program to print the color name, based on color code. If color code in not valid
then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,
W->White.

 */
public class Program8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char code = scanner.next().charAt(0);
        char newCh = 0;

        if (Character.isLowerCase(code)) {
            newCh = Character.toUpperCase(code);

            switch (newCh) {
                case 'R':
                    System.out.println("Red");
                    break;
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                case 'W':
                    System.out.println("White");
                    break;
                default:
                    System.out.println("Invalid Code");
            }
        } else {
            switch (code) {
                case 'R':
                    System.out.println("Red");
                    break;
                case 'B':
                    System.out.println("Blue");
                    break;
                case 'G':
                    System.out.println("Green");
                    break;
                case 'O':
                    System.out.println("Orange");
                    break;
                case 'Y':
                    System.out.println("Yellow");
                    break;
                case 'W':
                    System.out.println("White");
                    break;
                default:
                    System.out.println("Invalid Code");
            }
        }
    }
}






