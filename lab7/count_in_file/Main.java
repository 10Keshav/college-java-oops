import java.io.*;

public class Main {
  public static void main(String[] args) {
    String file = args[0];

    try (FileInputStream f = new FileInputStream(file)) {
      int ch = 0;
      int words = 1;
      int lines = 1;
      while (true) {
        int b = f.read();
        if (b == ' ')
          words++;
        if (b == '\n')
          lines++;
        ch++;
        if (b == -1) {
          System.out.println("Characters: " + ch);
          System.out.println("Words: " + words);
          System.out.println("Lines: " + lines);
          return;
        }
      }
    }

    catch (IOException e) {
      System.out.println("error reading files: " + e.getMessage());
    }
  }
}
