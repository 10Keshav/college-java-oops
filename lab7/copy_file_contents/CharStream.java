import java.io.*;
import java.util.Scanner;

public class CharStream {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("source: ");
    String src = sc.nextLine();
    System.out.print("dest: ");
    String dest = sc.nextLine();
    sc.close();
    try {
      FileReader fr = new FileReader(src);
      FileWriter fw = new FileWriter(dest);
      int ch;
      while ((ch = fr.read()) != -1)
        fw.write(ch);
      fr.close();
      fw.close();
      System.out.println("file copied");
    }

    catch (IOException e) {
      System.out.println("error: " + e);
    }
  }
}
