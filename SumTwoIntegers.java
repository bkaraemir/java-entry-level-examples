import java.util.Scanner;

public class SumTwoIntegers {

    // Method to sum two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int secondNumber = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Call the sum method and print the result
        int result = sum(firstNumber, secondNumber);
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + result);
    }
}
