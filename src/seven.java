import java.util.Scanner;
/*
Write a program to convert from upper case to lower case and vice versa of an alphabet
and print the old character and new character as shown in example (Ex: a->A, M->m).

 */
public class seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        char newCh;

        if(Character.isUpperCase(ch)) {
            newCh = Character.toLowerCase(ch);
            System.out.println(ch + "->" + newCh);
        } else if(Character.isLowerCase(ch)) {
            newCh = Character.toUpperCase(ch);
            System.out.println(ch + "->" + newCh);
        } else {
            System.out.println("Not an alphabet");
        }
    }

}
