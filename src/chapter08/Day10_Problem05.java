package chapter08;

// 인터페이스 다형성과 추가 기능
// Animal05 타입으로 저장된 객체를 다운캐스팅하여 고유 기능 사용하기
interface Animal05 {
    void sound();
}

class Dog05 implements Animal05 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    void fetch() {
        System.out.println("공을 물어옵니다.");
    }
}

class Cat05 implements Animal05 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    void climb() {
        System.out.println("나무를 탑니다.");
    }
}

public class Day10_Problem05 {
    public static void main(String[] args) {
        Animal05 animal05 = new Dog05();
        animal05.sound();
        Dog05 dog05 = (Dog05) animal05;
        dog05.fetch();
    }
}
