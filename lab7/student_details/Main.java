import java.io.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("roll: ");
    long rollno = sc.nextLong();
    sc.nextLine();
    System.out.print("name: ");
    String name = sc.nextLine();
    System.out.print("subject: ");
    String subject = sc.nextLine();
    System.out.print("marks: ");
    float marks = sc.nextFloat();
    try {
      FileWriter fw = new FileWriter("student_details.txt");
      fw.write(rollno + " " + name + " " + subject + " " + marks);
      fw.close();

      FileReader fr = new FileReader("student_details.txt");
      BufferedReader br = new BufferedReader(fr);
      String data;
      while ((data = br.readLine()) != null)
        System.out.println(data);
      br.close();
    }

    catch (IOException e) {
      System.out.println("error: " + e);
    }
    sc.close();
  }
}
