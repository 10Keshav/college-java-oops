class RectOver {
  int length;
  int breadth;

  RectOver(int l, int b) {
    this.length = l;
    this.breadth = b;
  }

  RectOver() {
    length = breadth = 0;
  }

  double area() {
    return length * breadth;
  }
}

class DemoRectOverload {
  public static void main(String[] args) {
    RectOver rect1 = new RectOver(4, 5);
    RectOver rect2 = new RectOver();
    System.out.println(rect1.area());
    System.out.println(rect2.area());
  }
}
