package chapter07;

// instanceof
// 객체가 특정 자식 타입인지 확인한 후 다운캐스팅하세요.
class Animal06 {
}

class Dog06 extends Animal06 {
    void run() {
        System.out.println("강아지가 달립니다.");
    }
}

class Cat06 extends Animal06 {
    void jump() {
        System.out.println("고양이가 점프합니다.");
    }
}

public class Day08_Problem06 {
    public static void main(String[] args) {
        Animal06 animal06 = new Dog06();
        if (animal06 instanceof Dog06) {
            Dog06 dog = (Dog06) animal06;
            dog.run();
        }
    }
}
