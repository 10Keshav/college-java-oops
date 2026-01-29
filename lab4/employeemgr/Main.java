import java.util.Scanner;

interface Employee {
  void getDetails();
}

interface Manager extends Employee {
  void getDeptDetails();
}

class Head implements Manager {
  private int empId;
  private String empName;
  private int deptId;
  private String deptName;
  private Scanner sc;

  public Head(Scanner sc) {
    this.sc = sc;
  }

  @Override
  public void getDetails() {
    System.out.print("Enter employee id: ");
    empId = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter employee name: ");
    empName = sc.nextLine();
  }

  @Override
  public void getDeptDetails() {
    System.out.print("Enter department id: ");
    deptId = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter department name: ");
    deptName = sc.nextLine();
  }

  public void displayDetails() {
    System.out.println("\nEmployee id: " + empId);
    System.out.println("Employee name: " + empName);
    System.out.println("Department id: " + deptId);
    System.out.println("Department name: " + deptName);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Head head = new Head(sc);

    head.getDetails();
    head.getDeptDetails();
    head.displayDetails();

    sc.close();
  }
}
