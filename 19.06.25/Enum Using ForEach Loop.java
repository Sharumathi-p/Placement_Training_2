enum Size {
  SMALL, MEDIUM, LARGE, EXTRALARGE
 }
 class Main {
  public static void main(String[] args) {

    System.out.println("Access each enum constants");

    for(Size size : Size.values()) {
      System.out.print(size + ", ");
    }
  }
 }
