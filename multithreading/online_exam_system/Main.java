class OnlineExam implements Runnable {
  public void run() {
    String threadName = Thread.currentThread().getName();

    try {
      if (threadName.equals("Timer")) {
        // t1
        for (int i = 1; i <= 20; i++) {
          System.out.println(i);
          Thread.sleep(1000);
        }
      } else if (threadName.equals("AutoSave")) {
        // t2
        for (int i = 1; i <= 4; i++) {
          Thread.sleep(5000);
          System.out.println("Answer auto-saved");
        }
      }
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    OnlineExam exam = new OnlineExam();
    Thread t1 = new Thread(exam, "Timer");
    Thread t2 = new Thread(exam, "AutoSave");
    t1.start();
    t2.start();
  }
}
