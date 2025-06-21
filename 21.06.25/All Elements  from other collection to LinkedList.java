import java.util.LinkedList;
class Main {
  public static void main(String[] args) {
    LinkedList<String> mammals = new LinkedList<>();
    mammals.add("Dog");
    mammals.add("Cat");
    mammals.add("Horse");
    System.out.println("Mammals: " + mammals);
    LinkedList<String> animals = new LinkedList<>();
    animals.add("Crocodile");
    animals.addAll(mammals);
    System.out.println("Animals: " + animals);
  }
}
