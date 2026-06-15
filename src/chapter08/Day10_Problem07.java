package chapter08;

// 인터페이스 배열과 instanceof
// 배열에 저장된 여러 동물 중 Dog07만 찾아서 fetch() 실행하기
interface Animal07 {
    void sound();
}

class Dog07 implements Animal07 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void fetch() {
        System.out.println("공을 물어옵니다.");
    }
}

class Cat07 implements Animal07 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void climb() {
        System.out.println("나무를 탑니다.");
    }
}

public class Day10_Problem07 {
    public static void main(String[] args) {
        Animal07[] animal07s = {new Dog07(), new Cat07(), new Dog07()};
        for (Animal07 animal07 : animal07s) {
            animal07.sound();
            if (animal07 instanceof Dog07) {
                Dog07 dog07 = (Dog07) animal07;
                dog07.fetch();
            }
        }
    }
}
