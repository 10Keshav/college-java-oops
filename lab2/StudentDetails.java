import java.util.Scanner;

// what

class Students {
  int roll;
  String name = new String();
  double cg;

  void read() {
    Scanner sc = new Scanner(System.in);
    System.out.print("roll: ");
    roll = Integer.parseInt(sc.nextLine());

    System.out.print("name: ");
    name = sc.nextLine();

    System.out.print("cgpa: ");
    cg = sc.nextDouble();

    sc.close();
  }
}

class DemoStudent {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("no of students: ");
    Students stu = new Students();
    n = sc.nextInt();
    sc.close();
    for (int i = 0; i < n; i++) {
      stu.read();
    }
  }
}
