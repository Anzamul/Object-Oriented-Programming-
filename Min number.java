import java.util.Scanner;

public class Task2 {

    public static int minValue(int num1, int num2) {
        int min = Math.min(num1, num2);
        return (min);
    }

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int min = minValue(num1, num2);
        System.out.println("Minimum number is: " + min);
    }
}