public class Question1b {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int first = 1, second = 2, next;

        System.out.print("First " + n + " terms: ");

        // Loop to generate the first n terms of the Fibonacci sequence
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(first + " "); // Print the first term
                continue;
            }
            if (i == 2) {
                System.out.print(second + " "); // Print the second term
                continue;
            }

            // Generate the next term in the sequence
            next = first + second;
            first = second;
            second = next;

            System.out.print(next + " "); // Print the next term
        }
    }
}
