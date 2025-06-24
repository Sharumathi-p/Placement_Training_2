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

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        myDog.bark();
        
        Cat myCat = new Cat();
        myCat.sound();
        myCat.meow();
    }
}
