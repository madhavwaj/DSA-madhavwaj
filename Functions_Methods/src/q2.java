//2. Function with Return Type: Calculate Factorial

public class q2 {
    public static void main(String[] args) {
        // Define a variable 'number' and assign it the value 5
        int number = 5;

        // Call the calculateFactorial function and store the result in 'factorial'
        int factorial = calculateFactorial(number);

        // Print the factorial to the console
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    // Define a function named 'calculateFactorial' that calculates the factorial of a number recursively
    public static int calculateFactorial(int n) {
        // Base case: if n is 0, return 1 (factorial of 0 is 1)
        if (n == 0) {
            return 1;
        }

        // Recursive case: multiply n by the factorial of (n-1)
        return n * calculateFactorial(n - 1);
    }
}
