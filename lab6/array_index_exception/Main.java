import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    try {
      int i = 0;
      int num = 0;
      while (num != 'q') {
        num = sc.nextInt();
        arr[i] = num;
        i++;
      }
    }

    catch (Exception e) {
      System.out.println("Exception in thread \"main\"");
      System.out.println(e);
    }
    for (int a : arr)
      System.out.print(a);
    sc.close();
  }
}
