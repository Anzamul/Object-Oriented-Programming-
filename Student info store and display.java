import java.util.Scanner;

public class Student1 {

    private String name;
    private int Id;
    private double cgpa;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student1 s1 = new Student1();
        System.out.println("Enter Name: ");
        s1.name = input.nextLine();
        System.out.println("Enter Id: ");
        s1.Id = input.nextInt();
        System.out.println("Enter Cgpa: ");
        s1.cgpa = input.nextDouble();

        input.nextLine();

        Student1 s2 = new Student1();
        System.out.println("Enter name; ");
        s2.name = input.nextLine();
        System.out.println("Enter Id: ");
        s2.Id = input.nextInt();
        System.out.println("Enter CGPA: ");
        s2.cgpa = input.nextDouble();
        System.out.println("Name of 1st Student: " + s1.name);
        System.out.println("Id of 1st Student: " + s1.Id);
        System.out.println("CGPA of 1st Student: " + s1.cgpa);
        System.out.println("Name of 2nd Student: " + s2.name);
        System.out.println("ID of 2nd Student: " + s2.Id);
        System.out.println("CGPA of 2nd Student: " + s2.cgpa);
    }

}