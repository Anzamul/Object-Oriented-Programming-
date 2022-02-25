import java.util.Scanner;

public class Lab4 {

    public double Area(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return (area);
    }

    public static void main(String[] args) {
        Lab4 obj = new Lab4();
        System.out.print("Enter the radius: ");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double area = obj.Area(r);
        System.out.println("Area of a circle: " + area);
    }

}