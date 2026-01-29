import java.util.Scanner;

interface Staff {
  void earnings();

  void deductions();

  void bonus();
}

abstract class Manager implements Staff {
  protected double basicSalary;
  protected double da;
  protected double hra;
  protected double pf;
  protected double earning;
  protected double deduction;

  Manager(double basicSalary) {
    this.basicSalary = basicSalary;
  }

  @Override
  public void earnings() {
    da = 0.80 * basicSalary;
    hra = 0.15 * basicSalary;
    earning = basicSalary + da + hra;
  }

  @Override
  public void deductions() {
    pf = 0.12 * basicSalary;
    deduction = pf;
  }
}

class Substaff extends Manager {
  private double bonusAmount;

  Substaff(double basicSalary) {
    super(basicSalary);
  }

  @Override
  public void bonus() {
    bonusAmount = 0.50 * basicSalary;
  }

  public void display() {
    System.out.println("Earnings: " + (int) earning);
    System.out.println("Deduction: " + (int) deduction);
    System.out.println("Bonus: " + (int) bonusAmount);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Basic Salary: ");
    double basicSalary = sc.nextDouble();

    Substaff staff = new Substaff(basicSalary);

    staff.earnings();
    staff.deductions();
    staff.bonus();

    staff.display();

    sc.close();
  }
}
