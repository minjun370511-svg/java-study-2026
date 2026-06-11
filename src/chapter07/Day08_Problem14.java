package chapter07;

// 다형성 + 공통 메서드 호출
// 모든 동물의 소리를 출력한 후 개수를 세세요.
abstract class Animal14 {
    abstract void sound();
}

class Dog14 extends Animal14 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat14 extends Animal14 {
    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

class Bird14 extends Animal14 {
    @Override
    void sound() {
        System.out.println("짹짹!");
    }
}

public class Day08_Problem14 {
    public static void main(String[] args) {
        Animal14[] animal14s = {
                new Dog14(), new Cat14(), new Bird14(), new Dog14()
        };
        int count = 0;
        for (Animal14 animal14 : animal14s) {
            animal14.sound();
            count++;
        }
        System.out.println();
        System.out.println("전체 동물 수 : " + count);
    }
}
