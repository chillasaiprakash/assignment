import java.util.Scanner;
/*
Initialize two character variables in a program and display the characters in alphabetical
order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
second is e O/P:a,e

 */
public class Program4 {
    public static void main (String[] args) {
        System.out.println("enter the value");
        char item1;
        char item2;
        do {
            Scanner sc = new Scanner(System.in);
            item1 = sc.next().charAt(0);
            item2 = sc.next().charAt(0);


            if (item1 >= item2)

                System.out.println(item2 + " , " + item1);


            else

                System.out.println(item1 + " , " + item2);
        } while (item1 == item2);
    }

}


