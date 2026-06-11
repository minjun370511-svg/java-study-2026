package chapter07;

// 다형성과 객체 배열
// 여러 자식 객체를 부모 타입 배열에 저장하고 반복문으로 출력하세요.
class Animal04 {
    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog04 extends Animal04 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat04 extends Animal04 {
    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

public class Day08_Problem04 {
    public static void main(String[] args) {
        Animal04[] animal04s = {
                new Dog04(), new Cat04(), new Dog04()
        };
        for (Animal04 animal04 : animal04s) {
            animal04.sound();
        }
    }
}
