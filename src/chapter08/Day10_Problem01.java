package chapter08;

// 인터페이스 구현
// Vehicle 인터페이스를 구현하는 Car 클래스를 작성하고 실행하기
interface Vehicle01 {
    void run();
}

class Car01 implements Vehicle01 {
    @Override
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}

public class Day10_Problem01 {
    public static void main(String[] args) {
        Vehicle01 vehicle = new Car01();
        vehicle.run();
    }
}
