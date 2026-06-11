package chapter07;

// 추상 클래스 심화
// 두 개의 추상 메서드를 자식 클래스에서 구현하세요.
abstract class Animal09 {
    abstract void sound();

    abstract void move();
}

class Dog09 extends Animal09 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }

    @Override
    void move() {
        System.out.println("강아지가 달립니다.");
    }
}

public class Day08_Problem09 {
    public static void main(String[] args) {
        Animal09 animal09 = new Dog09();
        animal09.sound();
        animal09.move();
    }
}
