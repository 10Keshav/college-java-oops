import java.util.Scanner;

class CounterThread extends Thread {
  private int lower;
  private int upper;

  CounterThread(String name, int lower, int upper) {
    super(name);
    this.lower = lower;
    this.upper = upper;
  }

  public void run() {
    System.out.println("Thread - " + getName());
    System.out.print("Counter - ");

    for (int i = lower; i <= upper; i++) {
      System.out.print(i + " ");
      try {
        Thread.sleep(5);
      } catch (InterruptedException e) {
        System.out.println("Thread interrupted");
      }
    }
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Name of the thread: ");
    String threadName = sc.nextLine();
    System.out.print("Lower range of counter: ");
    int lower = sc.nextInt();
    System.out.print("Upper range of counter: ");
    int upper = sc.nextInt();
    sc.close();

    CounterThread t1 = new CounterThread(threadName, lower, upper);
    t1.start();
  }
}
