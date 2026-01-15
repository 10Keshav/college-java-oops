class RectOver {
  int length;
  int breadth;

  RectOver(int l, int b) {
    this.length = l;
    this.breadth = b;
  }

  int area(int a, int b) {
    return a * b;
  }

  long area(long a, long b) {
    return a * b;
  }

  double area(double a, double b) {
    return a * b;
  }
}

class DemoRectOverload {
  public static void main(String[] args) {
    RectOver rect = new RectOver(4, 5);
    rect.area(4, 5);
  }
}
