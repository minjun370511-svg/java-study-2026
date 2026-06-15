package chapter08;

// 여러 구현 객체를 Driver가 처리하기
// Driver08이 Animal08 객체를 받아 sound()를 실행하기
interface Animal08 {
    void sound();
}

class Dog08 implements Animal08 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat08 implements Animal08 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

class Cow08 implements Animal08 {
    @Override
    public void sound() {
        System.out.println("음머");
    }
}

class Driver08 {
    void makeSound(Animal08 animal08) {
        animal08.sound();
    }
}

public class Day10_Problem08 {
    public static void main(String[] args) {
        Driver08 driver08 = new Driver08();
        driver08.makeSound(new Dog08());
        driver08.makeSound(new Cat08());
        driver08.makeSound(new Cow08());
    }
}
