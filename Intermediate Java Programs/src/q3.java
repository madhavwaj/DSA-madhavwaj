import java.util.Scanner;

// Question 3) Take integer inputs till the user enters 0 and print the largest number from all.
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int largest = Integer.MIN_VALUE; // Initialize largest to the smallest possible integer value

        while (true) {
            System.out.println("Enter a number (Type 0 to exit)");
            number = sc.nextInt();

            if (number == 0) {
                break;
            }
            // Update the largest number if the entered number is larger
            if (number > largest) {
                largest = number;
            }
        }
        if (largest == Integer.MIN_VALUE) {
            System.out.println("No number found");
        }
        else {
            System.out.println("largest number is " + largest);
        }
    }
}