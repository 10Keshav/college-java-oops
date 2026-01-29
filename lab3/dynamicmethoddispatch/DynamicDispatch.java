class Apple {
  void show() {
    System.out.println("Show method of Apple");
  }
}

class Banana extends Apple {
  @Override
  void show() {
    System.out.println("Show method of Banana");
  }
}

class Cherry extends Apple {
  @Override
  void show() {
    System.out.println("Show method of Cherry");
  }
}

public class DynamicDispatch {
  public static void main(String[] args) {
    Apple ref;

    ref = new Apple();
    ref.show();

    ref = new Banana();
    ref.show();

    ref = new Cherry();
    ref.show();
  }
}
