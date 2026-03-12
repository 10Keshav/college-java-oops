import java.io.*;

public class Main {
  public static void main(String[] args) {
    String file1 = args[0];
    String file2 = args[1];

    try (FileInputStream f1 = new FileInputStream(file1); FileInputStream f2 = new FileInputStream(file2)) {
      int b1, b2;
      long pos = 0;
      while (true) {
        b1 = f1.read();
        b2 = f2.read();
        if (b1 != b2) {
          System.out.println("files differ at pos: " + pos);
          return;
        }
        if (b1 == -1 && b2 == -1) {
          System.out.println("files are same");
          return;
        }
        pos++;
      }
    }

    catch (IOException e) {
      System.out.println("error reading files: " + e.getMessage());
    }
  }
}
