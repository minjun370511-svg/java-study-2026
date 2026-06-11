package chapter07;

// 추상 클래스와 다형성
// 여러 자식 객체를 추상 클래스 배열에 저장하고 메서드를 호출하세요.
abstract class Animal08 {
    abstract void sound();
}

class Dog08 extends Animal08 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat08 extends Animal08 {
    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

public class Day08_Problem08 {
    public static void main(String[] args) {
        Animal08[] animal08s = {
                new Dog08(), new Cat08(), new Dog08()
        };
        for (Animal08 animal08 : animal08s) {
            animal08.sound();
        }
    }
}
