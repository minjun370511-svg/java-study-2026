package chapter07;

// 다운캐스팅 종합
// 부모 타입 배열에서 특정 자식 객체만 찾아 기능을 실행하세요.
abstract class Animal12 {
    abstract void sound();
}

class Dog12 extends Animal12 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }

    void run() {
        System.out.println("강아지가 달립니다.");
    }
}

class Cat12 extends Animal12 {
    @Override
    void sound() {
        System.out.println("야옹!");
    }

    void jump() {
        System.out.println("고양이가 점프합니다.");
    }
}

public class Day08_Problem12 {
    public static void main(String[] args) {
        Animal12[] animal12s = {
                new Dog12(), new Cat12(), new Dog12()
        };
        for (Animal12 animal12 : animal12s) {
            if (animal12 instanceof Dog12) {
                ((Dog12) animal12).run();
            } else if (animal12 instanceof Cat12) {
                ((Cat12) animal12).jump();
            }
        }
    }
}
