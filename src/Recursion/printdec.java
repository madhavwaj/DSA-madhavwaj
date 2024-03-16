package Recursion;

import java.util.Scanner;

public class printdec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        printdecreasing(n);
    }

    public static  void  printdecreasing(int n) {
        if (n==0){
            return ;
        }
        System.out.println(n);
        printdecreasing(n - 1);
    }
}
