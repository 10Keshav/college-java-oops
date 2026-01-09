import java.util.Scanner;

class Plastic2D {
  protected int length;
  protected int width;
  protected final int COST_PER_SQFT = 40;

  void getDimensions(int l, int w) {
    this.length = l;
    this.width = w;
  }

  int calcCost() {
    int area = length * width;
    return area * COST_PER_SQFT;
  }
}

class Plastic3D extends Plastic2D {
  private int height;
  private final int COST_PER_CUFT = 60;

  void getDimensions(int l, int w, int h) {
    super.getDimensions(l, w);
    this.height = h;
  }

  int calcCost() {
    int volume = length * width * height;
    return volume * COST_PER_CUFT;
  }
}

public class Plastic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("1. 2D Sheet");
    System.out.println("2. 3D Sheet");
    int choice = sc.nextInt();

    if (choice == 1) {
      Plastic2D sheet = new Plastic2D();
      System.out.println("lenght and width: ");
      int len = sc.nextInt();
      int wid = sc.nextInt();
      sheet.getDimensions(len, wid);

      System.out.println("cost of sheet: Rs." + sheet.calcCost());
    } else if (choice == 2) {
      Plastic3D box = new Plastic3D();
      System.out.println("length width height");
      int len = sc.nextInt();
      int wid = sc.nextInt();
      int ht = sc.nextInt();

      box.getDimensions(len, wid, ht);
      System.out.println("cost of box: Rs." + box.calcCost());
    }

    else
      System.out.println("invalid");
    sc.close();
  }
}
