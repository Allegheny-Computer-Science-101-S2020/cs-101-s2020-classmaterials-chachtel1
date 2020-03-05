public class Switch {
  int box1 = 0;
  int box2 = 0;

  public static void swap(Switch obj) {
    int temp = obj.box1;
    obj.box1 = obj.box2;
    obj.box2 = temp;
  }

  public static void main(String[] args) {
    int b1 = 100;
    int b2 = 200;
    Switch obj = new Switch();
    obj.box1 = b1;
    obj.box2 = b2;
    swap(obj);
    System.out.println(obj.box1 + "\t" + obj.box2);
  }
}
