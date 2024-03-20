//Question 1. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            if (i % n == 0) {
                System.out.println(i + " ");
            }
        }
    }
}