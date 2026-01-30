import java.util.Scanner;

class Plate {
  int length, width;

  Plate(int length, int width) {
    this.length = length;
    this.width = width;
    System.out.println("plate dimensions:");
    System.out.println("L: " + length + "\nB: " + width);
  }
}

class Box extends Plate {
  int height;

  Box(int length, int width, int height) {
    super(length, width);
    this.height = height;
    System.out.println("box dimensions:");
    System.out.println("L: " + length + "\nB: " + width + "\nH: " + height);
  }
}

class WoodBox extends Box {
  int thick;

  WoodBox(int length, int width, int height, int thick) {
    super(length, width, height);
    this.thick = thick;
    System.out.println("wood box dimensions:");
    System.out.println("L: " + length + "\nB: " + width + "\nH: " + height + "\nt: " + thick);
  }
}

public class InheritanceThing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("length: ");
    int l = sc.nextInt();

    System.out.print("width: ");
    int w = sc.nextInt();

    System.out.print("height: ");
    int h = sc.nextInt();

    System.out.print("thickness: ");
    int t = sc.nextInt();

    new WoodBox(l, w, h, t);
    sc.close();
  }
}
