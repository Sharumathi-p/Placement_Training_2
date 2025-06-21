import java.util.ArrayList;
class Main {
  public static void main(String[] args) {
    ArrayList<String> languages= new ArrayList<>();
    languages.ensureCapacity(3);
    languages.add("Java");
    languages.add("Python");
    languages.add("C");
    System.out.println("ArrayList: " + languages);
  }
}
