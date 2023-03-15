/**
 * Question1a
 */
public class Question1a {

    public static boolean isPrime(int number) {
        // If the number is less than or equal to 1, it's not prime
        if (number <= 1) {
            return false;
        }
        // Check if the number can be divided by any number between 2 and the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // If the number can be divided by any of these numbers, it's not prime
                return false;
            }
        }
        // If the number cannot be divided by any number between 2 and the square root of the number, it's prime
        return true;
    }

    public static void main(String[] args) {
        // Iterate through the numbers 1 to 500
        for (int i = 1; i <= 500; i++) {
            // Check if the number is prime using the isPrime method
            if (isPrime(i)) {
                // If the number is prime, print it to the console
                System.out.print(i + " ");
            }
        }
    }
    
}