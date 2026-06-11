package chapter07;

// 추상 클래스 종합
// 여러 자식 객체를 추상 클래스 배열에 저장하고 서로 다른 동작을 출력하세요.
abstract class Animal10 {
    abstract void move();
}

class Dog10 extends Animal10 {
    @Override
    void move() {
        System.out.println("강아지가 달립니다.");
    }
}

class Bird10 extends Animal10 {
    @Override
    void move() {
        System.out.println("새가 날아갑니다.");
    }
}

public class Day08_Problem10 {
    public static void main(String[] args) {
        Animal10[] animal10s = {
                new Dog10(), new Bird10(), new Dog10()
        };
        for (Animal10 animal10 : animal10s) {
            animal10.move();
        }
    }
}
