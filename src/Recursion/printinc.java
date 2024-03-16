package Recursion;

import java.util.Scanner;

public class printinc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prinincreasing(n);
    }

    public static void prinincreasing(int n) {
        if (n == 0) {
            return;
        }
        prinincreasing(n - 1);
        System.out.println(n);
        
    }
    
}
