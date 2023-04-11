import java.util.Scanner;
public class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        // user enters radius
        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        // area of circle formula
        double area = Math.PI * Math.pow(r, 2);
        System.out.printf("The Area of the circle is: %.2f\n", area);
    }
}