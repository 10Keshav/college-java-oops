
class CheckArgument extends Exception {
  public CheckArgument(String message) {
    super(message);
  }
}

public class Main {
  public void checky(String[] args) throws CheckArgument {
    if (args.length < 4)
      throw new CheckArgument("LESS THAN 4");
    else {
      int sum = 0;
      for (int i = 0; i < args.length; i++) {
        int num = Integer.parseInt(args[i]);
        sum += (num * num);
      }
      System.out.println("Sum: " + sum);
    }
  }

  public static void main(String[] args) {
    Main obj = new Main();
    try {
      obj.checky(args);
    }

    catch (CheckArgument e) {
      System.out.println("Exception occured: " + e);
    }
  }
}
