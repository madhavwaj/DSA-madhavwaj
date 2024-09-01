//4. Function with Multiple Parameters: Calculate Area of a Rectangle

public class q4 {
    public static void main(String[] args) {
        // Define two integer variables, 'length' and 'breadth'
        int length = 7;
        int breadth = 4;

        // Call the calculateArea function and store the result in 'area'
        int area = calculateArea(length, breadth);

        // Print the area of the rectangle to the console
        System.out.println("Area of the rectangle: " + area);
    }

    // Define a function named 'calculateArea' that takes length and breadth as parameters
    // and returns the area of the rectangle
    public static int calculateArea(int length, int breadth) {
        // Return the product of length and breadth (area of the rectangle)
        return length * breadth;
    }
}
