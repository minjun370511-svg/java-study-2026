package chapter07;

// 다운캐스팅 + 개수 세기
// 배열 안에 Dog와 Cat이 각각 몇 마리인지 세세요.
abstract class Animal13 {
    abstract void sound();
}

class Dog13 extends Animal13 {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }
}

class Cat13 extends Animal13 {
    @Override
    void sound() {
        System.out.println("야옹!");
    }
}

public class Day08_Problem13 {
    public static void main(String[] args) {
        Animal13[] animal13s = {
                new Dog13(), new Cat13(), new Dog13(), new Dog13(), new Cat13()
        };
        int dogCount = 0;
        int catCount = 0;
        for (Animal13 animal13 : animal13s) {
            if (animal13 instanceof Dog13) {
                dogCount++;
            } else if (animal13 instanceof Cat13) {
                catCount++;
            }
        }
        System.out.println("Dog 개수 : " + dogCount);
        System.out.println("Cat 개수 : " + catCount);
    }
}
