public class Objects {
  static int count = 0;

  Objects() {
    count++;
  }

  public static void main(String[] args) {
    Objects o1 = new Objects();
    Objects o2 = new Objects();
    Objects o3 = new Objects();
    Objects o4 = new Objects();
    System.out.println(count);
  }
}
