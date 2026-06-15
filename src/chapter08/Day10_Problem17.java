package chapter08;

// 인터페이스 배열에서 특정 타입의 개수와 총 전력 사용량 구하기
// TV와 Audio의 전력 사용량 합계 계산하기
interface Device17 {
    void powerOn();

    int getPowerUsage();
}

class TV17 implements Device17 {
    @Override
    public int getPowerUsage() {
        return 150;
    }

    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }
}

class Audio17 implements Device17 {
    @Override
    public int getPowerUsage() {
        return 50;
    }

    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }
}

public class Day10_Problem17 {
    public static void main(String[] args) {
        Device17[] devices = {
                new TV17(),
                new Audio17(),
                new TV17(),
                new Audio17(),
                new TV17()
        };
        int tvCount = 0;
        int totalPower = 0;
        for (Device17 device17 : devices) {
            device17.powerOn();
            totalPower += device17.getPowerUsage();
            if (device17 instanceof TV17) {
                tvCount++;
            }
        }
        System.out.println();
        System.out.println("TV 개수 : " + tvCount);
        System.out.println("전체 전력 사용량 : " + totalPower);
    }
}
