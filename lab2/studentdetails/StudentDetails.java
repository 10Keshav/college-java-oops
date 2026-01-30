import java.util.Scanner;

class Students {
  int roll;
  String name;
  float cg;

  void display() {
    System.out.println("roll: " + roll);
    System.out.println("name: " + name);
    System.out.println("cgpa: " + cg);
    System.out.println();
  }

  void mincg() {
    System.out.println(name + " got the least cgpa yikes: " + cg); // a method for this is unnecessary lmao
  }
}

class Main {
  public static void main(String[] args) {
    int n;
    int minInd = 0;
    float prev = 11.0f;
    Scanner sc = new Scanner(System.in);

    System.out.print("no of students: ");
    n = sc.nextInt();
    Students[] stu = new Students[n];

    System.out.println("roll name cg");
    for (int i = 0; i < n; i++) {
      stu[i] = new Students();

      System.out.println(String.format("Student %d:", i + 1));

      stu[i].roll = sc.nextInt();
      sc.nextLine();

      stu[i].name = sc.nextLine();

      stu[i].cg = sc.nextFloat();
      if (stu[i].cg < prev) {
        prev = stu[i].cg;
        minInd = i;
      }
    }
    for (int i = 0; i < n; i++)
      stu[i].display();
    stu[minInd].mincg();

    sc.close();
  }
}
