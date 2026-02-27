import java.util.Scanner;

class HrsException extends Exception {
  public HrsException(String message) {
    super(message);
  }
}

class MinException extends Exception {
  public MinException(String message) {
    super(message);
  }
}

class SecException extends Exception {
  public SecException(String message) {
    super(message);
  }
}

class Time {
  int hrs, mins, secs;

  public void getTime(int h, int m, int s) throws HrsException, MinException, SecException {
    if (h < 0 || h > 24)
      throw new HrsException("InvalidHourException: must be bw 0 and 24");
    if (m < 0 || m > 60)
      throw new MinException("InvalidMinuteException: must be bw 0 and 60");
    if (s < 0 || s > 60)
      throw new SecException("InvalidSecondException: must be bw 0 and 60");
    this.hrs = h;
    this.mins = m;
    this.secs = s;
  }

  public void show() {
    System.out.println("Correct time -> " + hrs + ":" + mins + ":" + secs);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Time t = new Time();

    try {
      System.out.print("Hours: ");
      int hrs = sc.nextInt();
      System.out.print("Minutes: ");
      int mins = sc.nextInt();
      System.out.print("Seconds: ");
      int secs = sc.nextInt();
      sc.close();
      t.getTime(hrs, mins, secs);
      t.show();
    }

    catch (HrsException e) {
      System.out.println("exception occured: " + e);
    }

    catch (MinException e) {
      System.out.println("exception occured: " + e);
    }

    catch (SecException e) {
      System.out.println("exception occured: " + e);
    }
  }
}
