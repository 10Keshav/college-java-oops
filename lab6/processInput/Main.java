import java.util.Scanner;

class NegativeNumberException extends Exception {
  public NegativeNumberException(String message) {
    super(message);
  }
}

public class Main {

  public void ProcessInput() throws NegativeNumberException {
    Scanner sc = new Scanner(System.in);
    System.out.print("number: ");
    int n = sc.nextInt();
    sc.close();
    if (n < 0)
      throw new NegativeNumberException("number should be positive");
    else
      System.out.println("Double value: " + 2 * n);
  }

  public static void main(String[] args) {
    Main obj = new Main();
    try {
      obj.ProcessInput();
    }

    catch (NegativeNumberException e) {
      System.out.println("Caught the exception");
      System.out.println("Exception occured: " + e);
    }
  }
}
