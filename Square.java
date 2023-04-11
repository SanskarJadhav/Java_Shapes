import java.util.Scanner;
public class Square extends Shape {
    Scanner sc = new Scanner(System.in);
    @Override
    public void calculateArea(){
        // user enters side length
        System.out.print("Enter the side length: ");
        double l = sc.nextDouble();
        // area of square formula
        double area = Math.pow(l, 2);
        System.out.printf("The Area of the square is: %.2f", area);
    }
}