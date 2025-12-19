import java.util.Scanner;

class Rectangle {
  int length;
  int breadth;
  int perimeter;
  int area;

  public void read() {
    Scanner sc = new Scanner(System.in);
    System.out.print("length: ");
    length = sc.nextInt();

    System.out.print("breadth: ");
    breadth = sc.nextInt();

    sc.close();
  }

  public void calculate() {
    perimeter = 2 * (length + breadth);
    area = length * breadth;
  }

  public void display() {
    System.out.println("Perimeter: " + perimeter);
    System.out.println("Area: " + area);
  }
}

class DemoAgain {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    rectangle.read();
    rectangle.calculate();
    rectangle.display();
  }
}
