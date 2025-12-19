public class countOddEven {
  public static void main(String[] args) {
    int oddC = 0;
    int evenC = 0;
    // if (args.length != 10) {
    // System.out.println("enter 10");
    // return;
    // }
    for (int i = 0; i < 10; i++) {
      int num = Integer.parseInt(args[i]);
      if (num % 2 == 0)
        evenC++;
      else
        oddC++;
    }
    System.out.println("odd: " + oddC);
    System.out.println("even: " + evenC);

  }
}
