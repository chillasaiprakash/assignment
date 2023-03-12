import java.util.Scanner;
/*
Intialize a character variable in a program and if the value is alphabet then print
"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
Character"
 */
public class Program5 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().charAt(0);
        if (char1 >= 48 && char1 <= 57) {
            System.out.print("You entered is Digit");

        } else if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.print("You entered Alphabet");
        } else {
            System.out.print("You entered special character");

        }
    }
}
