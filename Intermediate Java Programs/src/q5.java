import java.util.Scanner;

// Factorial Program In Java
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static long calculateFactorial(int number){
        if (number<0){
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long factorial = 1;
        for(int i =1; i<=number; i++){
            factorial *= i;
        }
        return factorial;
    }
}
//Explanation:
//
//We take input from the user for the number whose factorial needs to be calculated.
//We define a method calculateFactorial that takes an integer number as an argument and returns its factorial.
//Inside the calculateFactorial method, we first check if the number is negative. If it is, we throw an IllegalArgumentException because factorial is not defined for negative numbers.
//We initialize a variable factorial to 1 to store the factorial value.
//We use a for loop to iterate from 1 to the given number.
//Inside the loop, we multiply the factorial with the loop variable i in each iteration.
//Finally, we return the factorial value.
