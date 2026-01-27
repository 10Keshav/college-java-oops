class Overloading {
  int sub(int a, int b) {
    return a - b;
  }

  double sub(double a, double b) {
    return a - b;
  }

  long sub(long a, long b) {
    return a - b;
  }
}

class DriverDemo {
  public static void main(String[] args) {
    Overloading o = new Overloading();
    System.out.println(o.sub(4, 5));
    System.out.println(o.sub(4.2, 5.51));
    System.out.println(o.sub(4132768, 57281394));
  }
}
