package Recursion;

import java.util.Scanner;

public class printdecinc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdecinc(n);
    }

    public static void printdecinc(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printdecinc(n - 1);
        System.out.println(n);
    }   
}