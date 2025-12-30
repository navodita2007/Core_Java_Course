package com.navodita.oops.polymorphism.method_overriding;

// Superclass
class Animal {
    Animal getAnimal() {
        System.out.println("Returning Animal");
        return this;
    }
}

// Subclass
class Dog extends Animal {
    // Covariant return type — returns Dog instead of Animal
    @Override
    Dog getAnimal() {
        System.out.println("Returning Dog");
        return this;
    }

    void bark() {
        System.out.println("Woof!");
    }
}

// Test class
public class CovariantExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.getAnimal(); // Output: Returning Animal

        Dog d = new Dog();
        d.getAnimal(); // Output: Returning Dog

        // Demonstrate covariant behavior:
        Animal ref = new Dog(); // Polymorphism
        Animal result = ref.getAnimal(); // returns Dog object
//         result.bark(); // ❌ not accessible, because reference type is Animal

        // But if we explicitly cast:
        Dog dogResult = ((Dog) ref.getAnimal());
        dogResult.bark(); // ✅ Woof!
    }
}
