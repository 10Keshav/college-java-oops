import java.util.Scanner;

class Check {
  String s1;
  String s2;
  String sub1;
  String sub2;

  boolean check(String s, String sub) {
    return (s.contains(sub));
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Check str = new Check();
    System.out.println("str and substr");
    String s1 = sc.nextLine();
    String sub1 = sc.nextLine();
    System.out.println("str and substr");
    String s2 = sc.nextLine();
    String sub2 = sc.nextLine();

    if (str.check(s1, sub1) == str.check(s2, sub2)) {
      String concat = s1 + s2;
      System.out.println(concat);
    } else
      System.out.println("no.");
    sc.close();
  }
}
