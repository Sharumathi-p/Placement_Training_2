interface CanRun {
    void run();
}

interface CanBark {
    void bark();
}

class Dog implements CanRun, CanBark {
    public void run() {
        System.out.println("Dog runs fast");
    }
    
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.run();
        myDog.bark();
    }
}
