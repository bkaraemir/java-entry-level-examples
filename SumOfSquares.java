import java.util.Scanner;

public class SumOfSquares {

    // Method to calculate the sum of squares up to a given number
    public static int calculateSumOfSquares(int n) {
        // Using the mathematical formula for the sum of squares of the first n natural numbers
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int userInput = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Check if the entered number is positive
        if (userInput < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Call the calculateSumOfSquares method and print the result
            int result = calculateSumOfSquares(userInput);
            System.out.println("The sum of squares up to " + userInput + " is: " + result);
        }
    }
}
