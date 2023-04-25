import java.io.IOException;

public class ExceptionHandling {




        public static void main(String[] args) {
            try {
                // code that may throw an exception
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[4]);
                // Accessing out of bounds index
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // code to handle the exception
                System.out.println("An exception occurred: " + e.getMessage());
            }
            finally {
                // code that will be executed regardless of whether an exception is thrown or not
                System.out.println("This code will always be executed.");
            }

            try {
                // code that may throw an exception
                throw new IOException("An IO exception occurred.");
            }
            catch (IOException e) {
                // code to handle the exception
                System.out.println("An exception occurred: " + e.getMessage());
            }
            catch (Exception s) {
                // code to handle the exception
                throw new RuntimeException("An exception Exception occurred: " + s.getMessage());
            }

            try {
                // code that may throw an exception
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[4]); // Accessing out of bounds index
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // code to handle the exception
                throw new RuntimeException("An exception occurred: " + e.getMessage());
            }
            catch (Exception s) {
                // code to handle the exception
                throw new RuntimeException("An exception Exception occurred: " + s.getMessage());
            }
            finally {
                // code that will be executed regardless of whether an exception is thrown or not
                System.out.println("This code will always be executed.");
            }
        }

        public static void someMethod() throws IOException {
            // code that may throw an exception
            throw new IOException("An IO exception occurred.");
        }

    }

