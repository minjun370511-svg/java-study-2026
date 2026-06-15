package chapter08;

// 인터페이스 다형성 활용
// 다운캐스팅 없이 모든 기기의 전력 사용량 합계 구하기
interface Device18 {
    void powerOn();

    int getPowerUsage();
}

class TV18 implements Device18 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class Audio18 implements Device18 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 50;
    }
}

class AirConditioner18 implements Device18 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 300;
    }
}

public class Day10_Problem18 {
    public static void main(String[] args) {
        Device18[] devices = {
                new TV18(),
                new Audio18(),
                new AirConditioner18(),
                new TV18(),
                new Audio18()
        };
        int totalPower = 0;
        for (Device18 device18 : devices) {
            device18.powerOn();
            totalPower += device18.getPowerUsage();
        }
        System.out.println();
        System.out.println("전체 전력 사용량 : " + totalPower);
    }
}
