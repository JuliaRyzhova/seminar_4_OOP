//  ласс представл€ющий собаку
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // √еттеры и сеттеры дл€ полей

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

//  ласс представл€ющий кошку
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // √еттеры и сеттеры дл€ полей

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

//  ласс представл€ющий птицу
class Bird {
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // √еттеры и сеттеры дл€ полей

    public void chirp() {
        System.out.println(name + " is chirping.");
    }
}
//  ласс, использующий различных животных
public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        // ¬ызываем методы животных
        dog.bark();
        cat.meow();
        bird.chirp();
    }
}