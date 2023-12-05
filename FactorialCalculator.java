public class FactorialCalculator {
    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: n! = n * (n-1)!
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        // Example usage
        int number = 5;
        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
