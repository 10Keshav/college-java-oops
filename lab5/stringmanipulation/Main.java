import java.io.*;
import java.util.Scanner;

class Functions {

  public void count(String s) {
    int n = s.length();
    int vowels = 0, consonants = 0, words = 0;
    for (int i = 0; i < n; i++) {
      char ch = s.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        vowels++;
      else if (ch == ' ')
        words++;
      else
        consonants++;
    }
    System.out.println("vowels: " + vowels);
    System.out.println("consonants: " + consonants);
    System.out.println("words: " + words);
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("1) Change the case of the string");
    System.out.println("2) Reverse the string");
    System.out.println("3) Compare two strings");
    System.out.println("4) Insert one string into another string");
    System.out.println("5) Check whether the character is present in the string and at which position");
    System.out.println("6) Check whether the string is palindrome or not.");
    System.out.println("7) Check the number of word, vowel and consonant in the string");

    Scanner sc = new Scanner(System.in);
    System.out.print("String: ");
    String str = sc.nextLine();

    int choice = 9;
    while (choice != 0) {
      System.out.print("Choose: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.println("uppercase: " + str.toUpperCase());
          System.out.println("lowercase: " + str.toLowerCase());
          break;

        case 2:
          String rev = new StringBuilder(str).reverse().toString();
          System.out.println("reversed: " + rev);
          break;

        case 3:
          String str2 = sc.next();
          System.out.println(str.equalsIgnoreCase(str2) ? "Yes they are the same" : "No they are not the same");
          break;

        case 4:
          str2 = sc.next();
          // insert into anohter
          break;

        case 5:
          char c = sc.next().charAt(0);
          if (str.indexOf(c) != -1)
            System.out.println("Yes, " + c + " is present, index: " + str.indexOf(c));
          else
            System.out.println("no " + c + " present");
          break;

        case 6:
          String rev2 = new StringBuilder(str).reverse().toString();
          System.out.println(str.equalsIgnoreCase(rev2) ? "Yes palindrome" : "No palindrome");
          break;

        case 7:
          Functions fn = new Functions();
          fn.count(str);
          break;

        case 0:
          System.out.println("bye bye");
          break;

        default:
          System.out.println("again");
      }
    }
    sc.close();
  }
}
