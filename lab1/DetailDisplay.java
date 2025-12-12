import java.util.Scanner;

public class DetailDisplay {
  public static void main(String[] args) {
    Scanner name_scan, roll_scan, section_scan, branch_scan;

    name_scan = new Scanner(System.in);
    System.out.print("name: ");
    String name = name_scan.nextLine();

    roll_scan = new Scanner(System.in);
    System.out.print("roll no: ");
    int roll = roll_scan.nextInt();

    section_scan = new Scanner(System.in);
    System.out.print("section: ");
    String section = section_scan.nextLine();

    branch_scan = new Scanner(System.in);
    System.out.print("branch: ");
    String branch = branch_scan.nextLine();

    System.out.println("name: " + name + "\nroll no: " + roll + "\nsection: " + section + "\nbranch: " + branch);

    name_scan.close();
    roll_scan.close();
    section_scan.close();
    branch_scan.close();
  }
}
