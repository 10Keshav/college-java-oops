import java.util.Scanner;

public class DetailDisplay {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("name: ");
    String name = scan.nextLine();

    System.out.print("roll no: ");
    int roll = Integer.parseInt(scan.nextLine());

    System.out.print("section: ");
    String section = scan.nextLine();

    System.out.print("branch: ");
    String branch = scan.nextLine();

    System.out.println("name: " + name);
    System.out.println("roll no: " + roll);
    System.out.println("section: " + section);
    System.out.println("branch: " + branch);

    scan.close();
  }
}
