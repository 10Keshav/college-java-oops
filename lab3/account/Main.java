import java.util.Scanner;

class Account {
  int acc_no;
  float balance;

  void input(Scanner sc) {
    System.out.print("acc_no: ");
    acc_no = Integer.parseInt(sc.nextLine());
    System.out.print("balance: ");
    balance = Float.parseFloat(sc.nextLine());
  }

  void disp() {
    System.out.println("acc. number: " + acc_no);
    System.out.println("balance: " + balance);
  }
}

class Person extends Account {
  String name;
  long aadhar_no;

  @Override
  void input(Scanner sc) {
    System.out.print("name: ");
    name = sc.nextLine();

    System.out.print("aadhar no.: ");
    aadhar_no = Long.parseLong(sc.nextLine());
    super.input(sc);
  }

  @Override
  void disp() {
    System.out.println("Name: " + name);
    System.out.println("Aadhar no.: " + aadhar_no);
    super.disp();
    System.out.println();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Person[] p = new Person[3];

    for (int i = 0; i < 3; i++) {
      System.out.println(String.format("Person %s", i + 1));
      p[i] = new Person();
      p[i].input(sc);
    }
    System.out.println();
    for (int i = 0; i < 3; i++)
      p[i].disp();
    sc.close();
  }
}
