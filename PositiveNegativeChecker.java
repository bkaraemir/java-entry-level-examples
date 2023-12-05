import java.util.Scanner;

public class PositiveNegativeChecker {

    // Method to check if a number is positive or negative
    public static void checkPositiveNegative(int number) {
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Call the checkPositiveNegative method
        checkPositiveNegative(userInput);
    }
}
