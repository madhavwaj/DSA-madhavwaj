// Question 2) Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;
public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        while(true){
            System.out.println("Enter a number (Type 0 to exit the code)");
            number = sc.nextInt();
            if (number==0){
               break;
            }
            sum += number;
        }
        System.out.println("Sum of all numbers: " + sum);

    }
}
