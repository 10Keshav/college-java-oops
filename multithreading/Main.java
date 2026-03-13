class FoodPrep extends Thread {
  public void run() {
    try {
      System.out.println("Order accepted");
      Thread.sleep(1000);
      System.out.println("Food Preparing");
      Thread.sleep(1000);
      System.out.println("Food packed");
      Thread.sleep(1000);
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class FoodDelivery extends Thread {
  public void run() {
    try {
      System.out.println("Delivery Started");
      Thread.sleep(1000);
      System.out.println("Reached customer location");
      Thread.sleep(1000);
      System.out.println("Delivered");
      Thread.sleep(1000);
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    FoodPrep prep = new FoodPrep();
    FoodDelivery delivery = new FoodDelivery();
    prep.start();
    try {
      prep.join();
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
    delivery.start();
  }
}
