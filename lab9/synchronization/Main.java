class Display {
  synchronized void show(String threadName) {
    String[] words = { "I", "Love", "Java", "Very", "Much" };

    for (String word : words) {
      System.out.println(threadName + ": " + word);
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        System.out.println("Interrupted");
      }
    }
  }
}

class MyThread extends Thread {
  Display d;

  MyThread(Display d, String name) {
    super(name);
    this.d = d;
  }

  public void run() {
    d.show(getName());
  }
}

public class Main {
  public static void main(String[] args) {
    Display obj = new Display();

    MyThread t1 = new MyThread(obj, "Thread 1");
    MyThread t2 = new MyThread(obj, "Thread 2");

    t1.start();
    t2.start();
  }
}
