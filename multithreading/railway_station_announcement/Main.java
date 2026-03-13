class Arrival implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Train" + i + " has arrived");
        Thread.sleep(1000);
      }
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class Departure implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Train" + i + " has departed");
        Thread.sleep(1000);
      }
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Arrival arrival = new Arrival();
    Departure departure = new Departure();

    Thread t1 = new Thread(arrival);
    Thread t2 = new Thread(departure);

    t1.start();
    t2.start();
  }
}
