import java.io.*;
import java.util.Scanner;

public class ByteStream {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("source: ");
    String src = sc.nextLine();
    System.out.print("dest: ");
    String dest = sc.nextLine();
    sc.close();
    try {
      FileInputStream fr = new FileInputStream(src);
      FileOutputStream fw = new FileOutputStream(dest);
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
