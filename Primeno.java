/**
 * The Primenum class is used to determine whether a given number is prime or not.
 */
import java.util.Scanner;

public class Primeno {

    public static boolean isPrime(int number) {
      // The code is implementing a method called isPrime that determines whether a given number is
      // prime or not.
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

   /**
    * The function computes and prints all prime numbers up to a given limit.
    * 
    * @param limit The limit parameter represents the upper limit or maximum value up to which we want
    * to find prime numbers. The method computePrimes will find and print all the prime numbers up to
    * this limit.
    */
    // The code is implementing a Java program that determines and prints all prime numbers up to a
    // given limit.
    public static void computePrimes(int limit) {
        System.out.printf("The prime numbers up to %d are:%n", limit);
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    // The public static void main(String[] args) method is the entry point of the Java program. It
    // is the method that gets executed when the program is run.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for the prime numbers: ");
        int limit = scanner.nextInt();

        Primeno.computePrimes(limit);

        scanner.close();
    }
}