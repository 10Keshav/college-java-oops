import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    try {
      for (int i = 0; i < n + 1; i++) {
        arr[i] = sc.nextInt();
      }
    }

    catch (Exception e) {
      System.out.println("Exception in thread \"main\"");
      System.out.println(e);
    }
    sc.close();
  }
}
