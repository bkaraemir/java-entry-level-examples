import java.util.Scanner;

public class CircleCircumferenceCalculator {

    // Method to calculate the circumference of a circle
    public static double calculateCircleCircumference(double radius) {
        // Circumference formula: C = 2 * π * r
        // where π (pi) is a constant approximately equal to 3.14159
        double pi = 3.14159;
        double circumference = 2 * pi * radius;
        return circumference;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Call the calculateCircleCircumference method
        double circumference = calculateCircleCircumference(radius);

        // Print the result
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
    }
}
