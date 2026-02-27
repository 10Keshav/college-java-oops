import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("numerator: ");
    int num = sc.nextInt();

    System.out.print("denominator: ");
    int den = sc.nextInt();

    try {
      int res = num / den;
      System.out.println("Result: " + res);
    }

    catch (ArithmeticException e) {
      System.out.println(e);
    }

    finally {
      System.out.println("finally block");
    }
    sc.close();
  }
}
