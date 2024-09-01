//3. Void Function: Print a Pattern

public class q3 {
    public static void main(String[] args) {
        // Call the printPattern function with the argument 5 to print a pattern of 5 rows
        printPattern(5);
    }

    // Define a function named 'printPattern' that prints a triangle pattern with n rows
    public static void printPattern(int n) {
        // Outer loop to control the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                // Print '*' followed by a space, without moving to the next line
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
