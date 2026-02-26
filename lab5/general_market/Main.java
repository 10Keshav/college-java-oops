import java.util.Scanner;

import General.Employee;
import Marketing.Sales;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("empoyee id: ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.print("empoyee name: ");
    String name = sc.nextLine();

    System.out.print("Salary: ");
    double basic = sc.nextDouble();

    Sales s = new Sales(id, name, basic);

    System.out.println("empid: " + s.getEmpId());
    System.out.println("total earning: " + s.totalEarnings());

    sc.close();
  }
}
