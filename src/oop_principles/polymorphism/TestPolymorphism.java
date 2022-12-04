package oop_principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        Animal a1 = new Animal();

        a1.eat();
        a1.eat("Meet");
        a1.sleep();

        Cat c1 = new Cat();

        c1.eat();
        c1.eat("Fish");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();

        d1.eat();
        d1.eat("Bones");
        d1.sleep();
        d1.bark();

        /*
        Up-casting
        Parent reference = child object
         */

        System.out.println("\n------Up-casting-implicitly------\n");
        Animal a2 = new Cat(); //
        Animal a3 = new Dog();

        a3.sleep(); // Animal sleeps

        System.out.println("\n------down-casting-explicitly------\n");
//        Cat cat = (Cat) new Animal(); // bad example fo down casting
        Animal myDog = new Dog(); // Up-casting
        Dog newDog = (Dog) myDog;

        newDog.bark();

        Animal a10 = new Cat();
        Animal a11 = a10;
        Cat c10 = new Cat();
        c10 = (Cat) a10;
    }

}
