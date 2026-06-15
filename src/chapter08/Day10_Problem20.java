package chapter08;

// 인터페이스 배열에서 전력 사용량 1등과 2등 찾기
// 가장 전력을 많이 사용하는 기기와 두 번째로 많이 사용하는 기기 출력하기
interface Device20 {
    void powerOn();

    int getPowerUsage();
}

class TV20 implements Device20 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio20 implements Device20 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner20 implements Device20 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator20 implements Device20 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

public class Day10_Problem20 {
    public static void main(String[] args) {
        Device20[] devices = {
                new TV20(),
                new AirConditioner20(),
                new Audio20(),
                new Refrigerator20(),
                new TV20()
        };
        Device20 first = devices[0];
        Device20 second = null;
        for (Device20 device20 : devices) {
            device20.powerOn();
            if (device20.getPowerUsage() > first.getPowerUsage()) {
                second = first;
                first = device20;
            } else if (second == null) {
                second = device20;
            } else if (device20.getPowerUsage() > second.getPowerUsage()) {
                second = device20;
            }
        }
        System.out.println();
        System.out.println("1등 : " + first.getClass().getSimpleName() + " (" + first.getPowerUsage() + ")");
        System.out.println("2등 : " + second.getClass().getSimpleName() + " (" + second.getPowerUsage() + ")");

    }
}
