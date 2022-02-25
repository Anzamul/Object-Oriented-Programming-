
import java.util.Scanner;

public class LabTask2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N Number: ");
        int n = scanner.nextInt();
        int ak_arr[] = new int[n];

        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            ak_arr[i] = scanner.nextInt();
        }

        LabTask2 odd = new LabTask2();

        System.out.println("Even Numbers: " + akEven(ak_arr));
        System.out.println("Odd Numbers: " + odd.akOdd(ak_arr));

    }
 public static int akEven(int[] ak_arr) {
    int j = 0;
    for(int i = 0; i < ak_arr.length; i++) {
      if(ak_arr[i]%2 == 0) {
        j++;
      }
    }
    return j;
  }
  
  public int akOdd(int[] ak_arr) {
    int j = 0;
    for(int i = 0; i < ak_arr.length; i++) {
      if(ak_arr[i]%2 != 0) {
        j++;
      }
    }
    return j;
  }
}
