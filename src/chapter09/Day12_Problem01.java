package chapter09;

// 인스턴스 멤버 클래스
// Car 클래스 내부에 Engine 중첩 클래스를 만들고 엔진 정보를 출력하기
class Car01 {
    String model;

    Car01(String model) {
        this.model = model;
    }

    class Engine01 {
        int horsepower;

        Engine01(int horsepower) {
            this.horsepower = horsepower;
        }

        void showInfo() {
            System.out.println("차량 모델 : " + model);
            System.out.println("엔진 출력 : " + horsepower + "마력");
        }
    }
}

public class Day12_Problem01 {
    public static void main(String[] args) {
        Car01 car01 = new Car01("Sonata");

        Car01.Engine01 engine01 = car01.new Engine01(200);

        engine01.showInfo();
    }
}
