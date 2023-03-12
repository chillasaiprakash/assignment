public class Program13 {

    /*Write a program to print prime numbers between 10 and 99.*/
    public static void main(String[] args) {
        int start = 10;
        int end = 99;

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

