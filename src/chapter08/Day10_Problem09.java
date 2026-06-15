package chapter08;

// 인터페이스 배열과 매개변수 다형성
// Driver09가 여러 Animal09 객체를 순서대로 처리하기
interface Animal09 {
    void sound();
}

class Dog09 implements Animal09 {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat09 implements Animal09 {
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

class Cow09 implements Animal09 {
    @Override
    public void sound() {
        System.out.println("음머");
    }
}

class Driver09 {
    void makeSound(Animal09 animal09) {
        animal09.sound();
    }
}

public class Day10_Problem09 {
    public static void main(String[] args) {
        Animal09[] animal09s = {
                new Dog09(),
                new Cat09(),
                new Cow09(),
                new Dog09()
        };
        Driver09 driver09 = new Driver09();
        for (Animal09 animal09 : animal09s) {
            driver09.makeSound(animal09);
        }
    }
}
