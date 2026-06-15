package chapter08;

// 인터페이스 다형성
// Vehicle 인터페이스를 이용하여 Car와 Bus를 같은 방식으로 실행하기
interface Vehicle02 {
    void run();
}

class Car02 implements Vehicle02 {
    @Override
    public void run() {
        System.out.println("자동차가 달립니다.");
    }
}

class Bus02 implements Vehicle02 {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}

public class Day10_Problem02 {
    public static void main(String[] args) {
        Vehicle02[] vehicle02s = {new Car02(), new Bus02()};
        for (Vehicle02 vehicle02 : vehicle02s) {
            vehicle02.run();
        }
    }
}
