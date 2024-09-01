//5. Overloaded Functions: Calculate Power of a Number

public class q5 {
    public static void main(String[] args) {
        // Call the power function with one argument to calculate the square of 4
        System.out.println("Square of 4: " + power(4));

        // Call the power function with two arguments to calculate 4 raised to the power 3
        System.out.println("4 raised to the power 3: " + power(4, 3));
    }

    // Define a function named 'power' that takes one integer parameter and returns its square
    public static int power(int x) {
        // Return the square of the number (x * x)
        return x * x;
    }

    // Define another overloaded 'power' function that takes two integer parameters (base and exponent)
    // and returns the base raised to the power of the exponent
    public static int power(int x, int y) {
        // Initialize a variable 'result' to 1 (since any number raised to the power of 0 is 1)
        int result = 1;

        // Use a for loop to multiply the base 'x' by itself 'y' times
        for (int i = 0; i < y; i++) {
            result *= x;
        }

        // Return the final result
        return result;
    }
}
