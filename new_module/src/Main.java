// ����������
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// ��������, ������� ���������� ����� makeSound()
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // �������: "Animal makes a sound"

        Dog dog = new Dog();
        dog.makeSound(); // �������: "Dog barks"
    }
}