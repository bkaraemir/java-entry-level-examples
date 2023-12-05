import java.util.Scanner;

public class SumOfIntegers {

    // Method to calculate the sum of integers up to a given number
    public static int calculateSum(int n) {
        // Using the mathematical formula for the sum of an arithmetic series
        return n * (n + 1) / 2;
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
            // Call the calculateSum method and print the result
            int result = calculateSum(userInput);
            System.out.println("The sum of integers up to " + userInput + " is: " + result);
        }
    }
}
