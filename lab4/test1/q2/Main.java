import java.util.Scanner;

class Toy {
  int id;
  String name;
  int qty;
  int price;

  // void set(int id, String name, int qty, int price) {
  // this.id = id;
  // this.name = name;
  // this.qty = qty;
  // this.price = price;
  // }

  void display() {
    System.out.println("id: " + id);
    System.out.println("name: " + name);
    System.out.println("qty: " + qty);
    System.out.println("price: " + price);
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;

    System.out.print("no: ");
    int n = sc.nextInt();

    Toy[] toy = new Toy[n];

    System.out.println("id name qty price");
    for (int i = 0; i < n; i++) {
      toy[i] = new Toy();
      System.out.println("TOY" + (i + 1));
      toy[i].id = sc.nextInt();
      sc.nextLine();
      toy[i].name = sc.nextLine();
      toy[i].qty = sc.nextInt();
      toy[i].price = sc.nextInt();
      sum += toy[i].price;
    }

    for (int i = 0; i < n; i++) {
      toy[i].display();
    }

    System.out.println("total: " + sum);
    sc.close();
  }
}
