import java.util.Scanner;
public class Rectangle extends Shape {
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        // user enters length and height
        System.out.print("Enter the length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the height: ");
        double h = sc.nextDouble();
        // area of rectangle formula
        double area = l * h;
        System.out.printf("The Area of the rectangle is: %.2f\n", area);
    }
}