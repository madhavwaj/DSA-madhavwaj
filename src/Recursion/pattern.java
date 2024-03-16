package Recursion;

public class pattern {
    public static void main(String[] args) {
        pattern4(4);

    }
    
    //pattern 1
    static void pattern1(int n) {
            //for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");

            }
            //one row printed new line added 
            System.out.println();

        }
    
    //pattern 2
    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");

            }
            //one row printed new line added 
            System.out.println();

        }
    }

     //pattern 3
     static void pattern3(int n) {
         for (int row = 1; row <= n; row++) {
             //for every row, run the col
             for (int col = 1; col <= n - row + 1; col++) {
                 System.out.print("* ");

             }
             //one row printed new line added 
             System.out.println();

         }
     }
    
      //pattern 4
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col);

            }
            //one row printed new line added 
            System.out.println();

            //pattern28
            

        }
    }
    
}
