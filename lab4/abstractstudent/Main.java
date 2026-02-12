import java.util.Scanner;

abstract class Student {
  int roll_no;
  long reg_no;

  void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Roll no.: ");
    roll_no = sc.nextInt();
    System.out.print("Reg. no.: ");
    reg_no = sc.nextLong();
    sc.close();
  }

  abstract void course();
}

class Kiitian extends Student {
  @Override
  void course() {
    System.out.println("Course - B.Tech. (Computer Science & Engg)");
  }

  void display() {
    System.out.println("\nRoll no.: " + roll_no);
    System.out.println("Reg. no.: " + reg_no);
    course();
  }
}

public class Main {
  public static void main(String[] args) {
    Kiitian k = new Kiitian();
    k.getInput();
    k.display();
  }
}
