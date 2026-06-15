package chapter08;

// 인터페이스 배열
// 여러 구현 객체를 배열에 저장하여 실행하기
interface Animal03 {
    void sound();
}

class Dog03 implements Animal03 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat03 implements Animal03 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

class Cow03 implements Animal03 {
    @Override
    public void sound() {
        System.out.println("음머");
    }
}

public class Day10_Problem03 {
    public static void main(String[] args) {
        Animal03[] animal03s = {new Dog03(), new Cat03(), new Cow03()};
        for (Animal03 animal03 : animal03s) {
            animal03.sound();
        }
    }
}
