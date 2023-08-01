// ����� �������������� ������
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ������� � ������� ��� �����

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// ����� �������������� �����
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ������� � ������� ��� �����

    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

// ����� �������������� �����
class Bird {
    private String name;
    private int age;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ������� � ������� ��� �����

    public void chirp() {
        System.out.println(name + " is chirping.");
    }
}
// �����, ������������ ��������� ��������
public class AnimalApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3);
        Cat cat = new Cat("Whiskers", 2);
        Bird bird = new Bird("Tweety", 1);

        // �������� ������ ��������
        dog.bark();
        cat.meow();
        bird.chirp();
    }
}