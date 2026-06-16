package chapter08;

// Chapter08 최종보스
// 전력 사용량 기준으로 기기 순위 출력하기
interface Device28 {
    void powerOn();

    int getPowerUsage();
}

class TV28 implements Device28 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio28 implements Device28 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner28 implements Device28 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator28 implements Device28 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class Computer28 implements Device28 {
    @Override
    public void powerOn() {
        System.out.println("Computer ON");
    }

    @Override
    public int getPowerUsage() {
        return 300;
    }
}

class DeviceManager28 {
    void printPowerRanking(Device28[] device28s) {
        for (int i = 0; i < device28s.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < device28s.length; j++) {
                if (device28s[j].getPowerUsage() > device28s[maxIndex].getPowerUsage()) {
                    maxIndex = j;
                }
            }
            Device28 temp = device28s[i];
            device28s[i] = device28s[maxIndex];
            device28s[maxIndex] = temp;
        }
        System.out.println("전력 사용량 순위");
        for (int i = 0; i < device28s.length; i++) {
            System.out.println((i + 1) + "등 : " + device28s[i].getClass().getSimpleName() + " (" + device28s[i].getPowerUsage() + ")");
        }
    }
}

public class Day11_Problem28 {
    public static void main(String[] args) {
        Device28[] device28s = {
                new TV28(),
                new Audio28(),
                new AirConditioner28(),
                new Refrigerator28(),
                new Computer28()
        };
        for (Device28 device28 : device28s) {
            device28.powerOn();
        }
        DeviceManager28 deviceManager28 = new DeviceManager28();
        System.out.println();
        deviceManager28.printPowerRanking(device28s);
    }
}
