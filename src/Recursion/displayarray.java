package Recursion;
import java.io.*;
import java.util.Scanner;

public class displayarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //maddy(arr);
        

       /*public static  void maddy(int [] arr, int idx) 
        {
            if(idx == arr.length){
                return;
            }
            System.out.println(arr[idx]);
            maddy(arr, idx+1);

        }*/
    }
    
}
