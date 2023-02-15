import java.util.Scanner;

class CalculateG {

    // method to get multiplication of two numbers
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    // mehod to get square a single numbeer
    public static double square(double num) {
        return num * num;
    }

    // method to get summation of two numbers
    public static double summation(double num1, double num2) {
        return num1 + num2;
    }

    // method to print result
    public static void outline(String message, double result) {
        System.out.println(message + result);
    }

    // main method
    public static void main(String[] arguments) {

        // creating scanner object
        Scanner input = new Scanner(System.in);

        // original variables provided in the question
        double gravity = -9.81; // Earth's gravity in m/s^2
        double fallingTime = 30;
        double initialVelocity = 0.0;
        double finalVelocity;
        double initialPosition = 0.0;
        double finalPosition;

        // Add the formulas for position and velocity
        // 𝑥(𝑡) = 0.5 ∗𝑎𝑡2 + 𝑣𝑖𝑡 + 𝑥𝑖
        finalPosition = (0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition)
                / fallingTime;
        // 𝑣(𝑡) = 𝑎𝑡 + 𝑣𝑖
        finalVelocity = (gravity * fallingTime + initialVelocity) / fallingTime;

        // outputting final position and velocity
        System.out.println("The object's position after " + fallingTime + " seconds is "
                + finalPosition + " m.");
        // Add output line for velocity (similar to position)
        System.out.println("The object's velocity after " + fallingTime + " seconds is "
                + finalVelocity + " m/s");


        // variables to store user input
        double firstNum, secondNum;

        // request user input
        System.out.println("Enter the first number");
        firstNum = input.nextDouble();
        System.out.println("Enter the second number");
        secondNum = input.nextDouble();

        // creating variables, and calling static methods that are outside main method 
        double multiplicationResult = multiplication(firstNum, secondNum);
        double squareResult1 = square(firstNum);
        double squareResult2 = square(secondNum);
        double summationResult = summation(firstNum, secondNum);

        // outputting results by calling the outline method
        outline("Multiplication result: ", multiplicationResult);
        outline("Square result for " + firstNum + " is :", squareResult1);
        outline("Square result for " + secondNum + " is :", squareResult2);
        outline("Summation result: ", summationResult);
    }
}