package chapter08;

// 인터페이스 매개변수 다형성
// Driver가 다양한 Vehicle을 운전할 수 있도록 구현하기
interface Vehicle04 {
    void run();
}

class Car04 implements Vehicle04 {
    @Override
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}

class Bus04 implements Vehicle04 {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

class Driver04 {
    void drive(Vehicle04 vehicle04) {
        vehicle04.run();
    }
}

public class Day10_Problem04 {
    public static void main(String[] args) {
        Driver04 driver04 = new Driver04();
        driver04.drive(new Car04());
        driver04.drive(new Bus04());
    }
}
