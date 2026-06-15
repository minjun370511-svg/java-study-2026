package chapter08;

// 인터페이스 배열과 처리 클래스
// ZooKeeper12가 여러 Animal12 객체를 처리하고 타입별 추가 기능 실행하기
interface Animal12 {
    void sound();
}

class Dog12 implements Animal12 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public void fetch() {
        System.out.println("공을 물어옵니다.");
    }
}

class Cat12 implements Animal12 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    public void climb() {
        System.out.println("나무를 탑니다.");
    }
}

class Cow12 implements Animal12 {
    @Override
    public void sound() {
        System.out.println("음머");
    }
}

class Zookeeper12 {
    void checkAnimal(Animal12 animal12) {
        animal12.sound();
        if (animal12 instanceof Dog12) {
            Dog12 dog12 = (Dog12) animal12;
            dog12.fetch();
        }
        if (animal12 instanceof Cat12) {
            Cat12 cat12 = (Cat12) animal12;
            cat12.climb();
        }
    }
}

public class Day10_Problem12 {
    public static void main(String[] args) {
        Animal12[] animal12s = {
                new Dog12(),
                new Cat12(),
                new Cow12(),
                new Dog12()
        };
        Zookeeper12 zookeeper12 = new Zookeeper12();
        for (Animal12 animal12 : animal12s) {
            zookeeper12.checkAnimal(animal12);
        }
    }
}
