package chapter07;

// 메서드 오버라이딩(Overriding)
// Animal 클래스를 상속받아 Dog 클래스에서 소리를 재정의하세요.
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

public class Day08_Problem02 {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이");
        dog.sound();
    }
}
