class Arrival implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Plane" + i + " has arrived");
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
        System.out.println("Plane" + i + " has departed");
        Thread.sleep(1000);
      }
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class Boarding implements Runnable {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Plane" + i + " can be boarded");
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
    Boarding boarding = new Boarding();

    Thread t1 = new Thread(arrival);
    Thread t2 = new Thread(departure);
    Thread t3 = new Thread(boarding);

    t1.start();
    t2.start();
    t3.start();
  }
}
