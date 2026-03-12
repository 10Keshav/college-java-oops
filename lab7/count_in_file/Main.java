import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("file: ");
    String file = sc.nextLine();

    int ch = 0;
    int words = 0;
    int lines = 0;
    try {
      BufferedReader br = new BufferedReader(new FileReader(file));
      String line;

      while ((line = br.readLine()) != null) {
        lines++;

        ch += line.length();
        String[] wordList = line.trim().split("\\s+");
        if (!line.trim().isEmpty()) {
          words += wordList.length;
        }
      }
      br.close();
      System.out.println("Characters: " + ch);
      System.out.println("Words: " + words);
      System.out.println("Lines: " + lines);
    }

    catch (IOException e) {
      System.out.println("error reading files: " + e.getMessage());
    }
    sc.close();
  }
}
