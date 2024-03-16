package Recursion;

import java.io.*;
import java.util.Scanner;
public class displayanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        displayArr(arr,0);
    }
    //ex -> index se end tak sab print karde
    //faith -> index+1 se end tak sab print karna janta hai
    public static void displayArr(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }
    
}
 