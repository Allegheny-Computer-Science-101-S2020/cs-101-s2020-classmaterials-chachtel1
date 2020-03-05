import java.util.Scanner;

public class Flower {

private static String name;
private static int petals;
private static float price;
static Scanner scan = new Scanner(System.in);

public Flower(String name, int petals, float price) {
}

public static String setName() {
  name = scan.nextLine();
  return name;
}

public static int setPetals() {
  petals = scan.nextInt();
  return petals;
}

public static float setPrice() {
  price = scan.nextFloat();
  return price;
}

public static String getName() {
  return name;
}

public static int getPetals() {
  return petals;
}

public static float getPrice() {
  return price;
}

public static Flower flower = new Flower("Orchid", 12, 3.99f);

public static void printSummary(Flower flower) {
    System.out.println(flower.getName());
    System.out.println(flower.getPetals());
    System.out.println(flower.getPrice());
}

public static void main(String[] args){
  System.out.println("Here is your flower:");
  Flower.printSummary(flower);
  System.out.println("What is the name of the flower?");
  Flower.setName();
  System.out.println("How many petals does it have?");
  Flower.setPetals();
  System.out.println("What is its price?");
  Flower.setPrice();
  System.out.println("Here is your new flower:");
  Flower.printSummary(flower);

}
}
