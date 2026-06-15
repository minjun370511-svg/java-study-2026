package chapter08;

// 인터페이스 배열에서 가장 전력 사용량이 높은 객체 찾기
// 가장 전력을 많이 사용하는 기기의 종류와 전력 사용량 출력하기
interface Device19 {
    void powerOn();

    int getPowerUsage();
}

class TV19 implements Device19 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio19 implements Device19 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner19 implements Device19 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

public class Day10_Problem19 {
    public static void main(String[] args) {
        Device19[] devices = {
                new TV19(),
                new Audio19(),
                new AirConditioner19(),
                new TV19(),
                new Audio19()
        };
        int maxPower = 0;
        Device19 maxDevice = devices[0];
        for (Device19 device19 : devices) {
            device19.powerOn();
            if (device19.getPowerUsage() > maxDevice.getPowerUsage()) {
                maxDevice = device19;
            }
        }
        System.out.println();
        System.out.println("가장 전력 사용량이 높은 기기 : " + maxDevice.getClass().getSimpleName());
        System.out.println("전력 사용량 : " + maxDevice.getPowerUsage());
    }
}
