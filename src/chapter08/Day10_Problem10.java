package chapter08;

// 인터페이스 배열과 instanceof 종합
// 여러 동물 중 Dog10은 fetch(), Cat10은 climb() 실행하기
interface Animal10 {
    void sound();
}

class Dog10 implements Animal10 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void fetch() {
        System.out.println("공을 물어옵니다.");
    }
}

class Cat10 implements Animal10 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void climb() {
        System.out.println("나무를 탑니다.");
    }
}

class Cow10 implements Animal10 {
    @Override
    public void sound() {
        System.out.println("음머");
    }
}

public class Day10_Problem10 {
    public static void main(String[] args) {
        Animal10[] animal10s = {
                new Dog10(),
                new Cat10(),
                new Cow10(),
                new Dog10(),
                new Cat10()
        };
        for (Animal10 animal10 : animal10s) {
            animal10.sound();
            if (animal10 instanceof Dog10) {
                Dog10 dog10 = (Dog10) animal10;
                dog10.fetch();
            }
            if (animal10 instanceof Cat10) {
                Cat10 cat10 = (Cat10) animal10;
                cat10.climb();
            }
        }
    }
}
