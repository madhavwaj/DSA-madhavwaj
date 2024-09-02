class Car {
    String brand;
    String model;
    int year;

    // Constructor
    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    // Method to display car details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class q1 {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2021);

        car1.displayDetails();
        car2.displayDetails();
    }
}
