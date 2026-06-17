package chapter09;

// 익명 자식 객체 매개변수 전달
// Zoo12 클래스의 play() 메서드에 익명 자식 객체를 전달하여 동물 소리 출력하기
class Animal12 {
    void sound() {
        System.out.println("동물 소리");
    }
}

class Zoo12 {
    void play(Animal12 animal12) {
        animal12.sound();
    }
}

public class Day12_Problem12 {
    public static void main(String[] args) {
        Zoo12 zoo12 = new Zoo12();
        zoo12.play(new Animal12() {
            @Override
            void sound() {
                System.out.println("야옹");
            }
        });
        zoo12.play(new Animal12() {
            @Override
            void sound() {
                System.out.println("음메");
            }
        });
    }
}
