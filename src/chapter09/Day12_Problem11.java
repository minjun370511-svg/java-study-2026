package chapter09;

// 익명 자식 객체
// Animal11 클래스를 상속하는 익명 객체를 생성하여 sound()를 재정의하기
class Animal11 {
    void sound() {
        System.out.println("동물 소리");
    }
}

public class Day12_Problem11 {
    public static void main(String[] args) {
        Animal11 dog11 = new Animal11() {
            @Override
            void sound() {
                System.out.println("멍멍");
            }
        };
        dog11.sound();
    }
}
