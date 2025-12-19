import java.util.Scanner;

class Box {
  int length;
  int width;
  int height;

  public int volume() {
    return length * width * height;
  }
}

class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Box box = new Box();
    System.out.print("length: ");
    box.length = sc.nextInt();
    System.out.print("width: ");
    box.width = sc.nextInt();
    System.out.print("height: ");
    box.height = sc.nextInt();
    System.out.println("volume is " + box.volume());
    sc.close();
  }
}
