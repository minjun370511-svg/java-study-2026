package chapter08;

// instanceof 사용하기
// Animal06 타입의 객체가 Dog06인지 확인 후 다운캐스팅하기
interface Animal06 {
    void sound();
}

class Dog06 implements Animal06 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void fetch() {
        System.out.println("공을 물어옵니다.");
    }
}

class Cat06 implements Animal06 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void climb() {
        System.out.println("나무를 탑니다.");
    }
}

public class Day10_Problem06 {
    public static void main(String[] args) {
        Animal06 animal06 = new Dog06();
        animal06.sound();
        if (animal06 instanceof Dog06) {
            Dog06 dog06 = (Dog06) animal06;
            dog06.fetch();
        }
    }
}
