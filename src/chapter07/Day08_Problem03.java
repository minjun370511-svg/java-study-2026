package chapter07;

// 다형성(Polymorphism)
// 부모 타입 변수에 자식 객체를 저장하고 메서드를 호출하세요.
class Animal03 {
    String name;

    Animal03(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Cat03 extends Animal03 {
    Cat03(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

public class Day08_Problem03 {
    public static void main(String[] args) {
        Animal03 animal = new Cat03("나비");
        animal.sound();
    }
}
