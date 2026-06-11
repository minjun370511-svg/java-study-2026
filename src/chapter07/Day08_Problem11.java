package chapter07;

// 다형성 종합
// 여러 동물을 배열에 저장하고 각각의 행동을 출력하세요.
abstract class Animal11 {
    abstract void action();
}

class Dog11 extends Animal11 {
    @Override
    void action() {
        System.out.println("강아지가 꼬리를 흔듭니다.");
    }
}

class Cat11 extends Animal11 {
    @Override
    void action() {
        System.out.println("고양이가 털을 고릅니다.");
    }
}

class Bird11 extends Animal11 {
    @Override
    void action() {
        System.out.println("새가 날개를 펼칩니다.");
    }
}

public class Day08_Problem11 {
    public static void main(String[] args) {
        Animal11[] animal11s = {
                new Dog11(), new Cat11(), new Bird11()
        };
        for (Animal11 animal11 : animal11s) {
            animal11.action();
        }
    }
}
