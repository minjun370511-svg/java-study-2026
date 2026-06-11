package chapter07;

// 추상 클래스(Abstract)
// 추상 클래스를 상속받아 자식 클래스에서 메서드를 구현하세요.
abstract class Animal07 {
    abstract void sound();
}

class Dog07 extends Animal07 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

public class Day08_Problem07 {
    public static void main(String[] args) {
        Animal07 animal07 = new Dog07();
        animal07.sound();
    }
}
