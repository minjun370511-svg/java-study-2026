package chapter07;

// 타입 변환(Casting)
// 부모 타입으로 저장된 객체를 자식 타입으로 변환하여 자식 메서드를 호출하세요.
class Animal05 {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog05 extends Animal05 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }

    void run() {
        System.out.println("강아지가 달립니다.");
    }
}

public class Day08_Problem05 {
    public static void main(String[] args) {
        Animal05 animal05 = new Dog05();
        animal05.sound();
        Dog05 dog = (Dog05) animal05;
        dog.run();
    }
}

