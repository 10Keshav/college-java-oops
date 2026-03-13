class Patients extends Thread {
  public void run() {
    try {
      System.out.println("Patient1 registered");
      System.out.println("Patient2 registered");
      System.out.println("Patient3 registered");
      System.out.println("Patient4 registered");
      System.out.println("Patient5 registered");
      Thread.sleep(1000);
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class Doctor extends Thread {
  public void run() {
    try {
      System.out.println("Doctor1's consultation");
      System.out.println("Doctor2's consultation");
      System.out.println("Doctor3's consultation");
      System.out.println("Doctor4's consultation");
      System.out.println("Doctor5's consultation");
      Thread.sleep(1000);
    }

    catch (InterruptedException e) {
      System.out.println(e);
    }
  }
}

class LabTest extends Thread {
  public void run() {
    try {
      System.out.println("Lab Test1 conducted");
      System.out.println("Lab Test2 conducted");
      System.out.println("Lab Test3 conducted");
      System.out.println("Lab Test4 conducted");
      System.out.println("Lab Test5 conducted");
      Thread.sleep(1000);
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
