class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.bark();
    }
}
