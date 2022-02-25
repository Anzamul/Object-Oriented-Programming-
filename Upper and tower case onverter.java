import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a, b;
        System.out.print("Enter 1st String: ");
        a = in.nextLine();
        System.out.print("Enter 2nd String: ");
        b = in.nextLine();
        System.out.println("Upper case for 1st string = " + a.toUpperCase());
        System.out.println("Lower case for 1st String = " + a.toLowerCase());
        System.out.println("\nUpper case for 2nd String = " + b.toUpperCase());
        System.out.println("Lower case for 2nd String = " + b.toLowerCase());

    }
}