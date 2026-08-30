// Parent class (demonstrates abstraction & encapsulation)
class Animal {
    // Encapsulation: private fields
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (accessing private fields safely)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method that can be overridden (polymorphism)
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class (demonstrates inheritance)
class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // call parent constructor
        this.breed = breed;
    }

    // Overriding parent method (polymorphism)
    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof! Woof!");
    }

    public void showBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Another child class
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }
}

// Main class to run the program
public class test {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2);

        dog.displayInfo();
        dog.makeSound();
        dog.showBreed();

        System.out.println();

        cat.displayInfo();
        cat.makeSound();

        System.out.println();

        // Polymorphism: treating Dog and Cat as Animal
        Animal[] animals = { dog, cat };
        for (Animal a : animals) {
            a.makeSound(); // calls the correct overridden method
        }
    }
}