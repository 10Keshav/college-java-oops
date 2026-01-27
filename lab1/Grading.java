import java.util.Scanner;

public class Grading {
  public static void main(String[] args) {
    System.out.print("enter grade: ");
    Scanner obj = new Scanner(System.in);
    int grade = obj.nextInt();
    if (grade >= 90)
      System.out.println("O");
    else if (grade >= 80)
      System.out.println("E");
    else if (grade >= 70)
      System.out.println("A");
    else if (grade >= 60)
      System.out.println("B");
    else if (grade >= 50)
      System.out.println("C");
    else
      System.out.println("failed?");
    obj.close();
  }
}
