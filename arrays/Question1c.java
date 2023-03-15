public class Question1c {
    public static void main(String[] args) {
        int limit = 4000000; // Set the limit to 4 million
        int first = 0, second = 1, next;
        int sum = 0; // Initialize the sum of even-valued terms to zero

        // Generate the Fibonacci sequence until the current term exceeds the limit
        while (second <= limit) {
            if (second % 2 == 0) { // Check if the current term is even
                sum += second; // Add the current term to the sum
            }
            next = first + second; // Calculate the next term in the sequence
            first = second; // Update the first and second terms
            second = next;
        }

        // Print out the sum of all the even-valued terms in the sequence
        System.out.println("The sum of even-valued terms in the Fibonacci sequence " +
                           "whose values do not exceed " + limit + " is " + sum);
    }
}
