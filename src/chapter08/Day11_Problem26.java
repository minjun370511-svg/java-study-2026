package chapter08;

// DeviceManager 종합 통계
// 전체 전력 합계, 평균, 최고 전력 기기, 최저 전력 기기 출력하기
interface Device26 {
    void powerOn();

    int getPowerUsage();
}

class TV26 implements Device26 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio26 implements Device26 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner26 implements Device26 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator26 implements Device26 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class Computer26 implements Device26 {
    @Override
    public void powerOn() {
        System.out.println("Computer ON");
    }

    @Override
    public int getPowerUsage() {
        return 300;
    }
}

class DeviceManager26 {
    int getTotalPower(Device26[] device26s) {
        int total = 0;
        for (Device26 device26 : device26s) {
            total += device26.getPowerUsage();
        }
        return total;
    }

    double getAveragePower(Device26[] device26s) {
        return (double) getTotalPower(device26s) / device26s.length;
    }

    Device26 findMaxPowerDevice(Device26[] device26s) {
        Device26 max = device26s[0];
        for (Device26 device26 : device26s) {
            if (device26.getPowerUsage() > max.getPowerUsage()) {
                max = device26;
            }
        }
        return max;
    }

    Device26 findMinPowerDevice(Device26[] device26s) {
        Device26 min = device26s[0];
        for (Device26 device26 : device26s) {
            if (device26.getPowerUsage() < min.getPowerUsage()) {
                min = device26;
            }
        }
        return min;
    }
}

public class Day11_Problem26 {
    public static void main(String[] args) {
        Device26[] devices = {
                new TV26(),
                new Audio26(),
                new AirConditioner26(),
                new Refrigerator26(),
                new Computer26()
        };
        for (Device26 device26 : devices) {
            device26.powerOn();
        }
        DeviceManager26 deviceManager26 = new DeviceManager26();
        int total = deviceManager26.getTotalPower(devices);
        double avg = deviceManager26.getAveragePower(devices);
        Device26 max = deviceManager26.findMaxPowerDevice(devices);
        Device26 min = deviceManager26.findMinPowerDevice(devices);
        System.out.println();
        System.out.println("전체 전력 사용량 : " + total);
        System.out.println("평균 전력 사용량 : " + avg);
        System.out.println("최고 전력 기기 : " + max.getClass().getSimpleName() + " (" + max.getPowerUsage() + ")");
        System.out.println("최저 전력 기기 : " + min.getClass().getSimpleName() + " (" + min.getPowerUsage() + ")");
    }
}
