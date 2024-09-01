//1. Basic Function: Calculate Sum of Two Numbers

public class q1 {
    public static void main(String[] args) {
        // Define two integer variables
        int num1 = 10;
        int num2 = 20;

        // Call the sum function and store the result in the variable 'result'
        int result = sum(num1, num2);

        // Print the result to the console
        System.out.println("Sum: " + result);
    }

    // Define a function named 'sum' that takes two integer parameters and returns their sum
    public static int sum(int a, int b) {
        // Return the sum of the two parameters
        return a + b;
    }
}



