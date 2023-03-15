import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part (a): Read 15 integer values from the user and store them in an array
        int[] numbers = new int[15];
        System.out.println("Enter 15 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the values stored in the array
        System.out.println("Values stored in the array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Part (b): Ask the user for a number and check if it is present in the array
        System.out.println("Enter a number to search in the array:");
        int searchNumber = scanner.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // Part (c): Create a new array with the same elements as the original array but in reverse order
        int[] reversedNumbers = new int[numbers.length];
        for (int i = 0, j = numbers.length - 1; i < numbers.length; i++, j--) {
            reversedNumbers[j] = numbers[i];
        }

        // Print the values stored in the reversed array
        System.out.println("Values stored in the reversed array:");
        for (int number : reversedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Part (d): Calculate the sum and product of all the elements in the array
        int sum = 0;
        int product = 1;
        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        // Print the sum and product on separate lines
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
