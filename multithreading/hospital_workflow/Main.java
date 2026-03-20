class Patients extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Patient" + i + " registered");
        Thread.sleep(1000);
      }
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class Doctor extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Doctor" + i + "'s consultation");
        Thread.sleep(1000);
      }
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class LabTest extends Thread {
  public void run() {
    try {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Lab Test" + i + " conducted");
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
    Patients patient = new Patients();
    Doctor doc = new Doctor();
    LabTest lab = new LabTest();
    patient.start();
    try {
      patient.join();
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
    doc.start();
    try {
      doc.join();
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }

    lab.start();
  }
}
