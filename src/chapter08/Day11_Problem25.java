package chapter08;

// 인터페이스 배열에서 평균 전력 사용량 계산하기
// DeviceManager25가 전체 평균과 평균 이상 기기 개수를 구하기
interface Device25 {
    void powerOn();

    int getPowerUsage();
}

class TV25 implements Device25 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio25 implements Device25 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner25 implements Device25 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator25 implements Device25 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class DeviceManager25 {
    double getAveragePower(Device25[] device25s) {
        double sum = 0;
        for (Device25 device25 : device25s) {
            sum += device25.getPowerUsage();
        }
        return sum / device25s.length;
    }

    int countAboveAverage(Device25[] device25s, double average) {
        int count = 0;
        for (Device25 device25 : device25s) {
            if (device25.getPowerUsage() >= average) {
                count++;
            }
        }
        return count;
    }
}

public class Day11_Problem25 {
    public static void main(String[] args) {
        Device25[] devices = {
                new TV25(),
                new Audio25(),
                new AirConditioner25(),
                new Refrigerator25(),
                new TV25()
        };
        for (Device25 device25 : devices) {
            device25.powerOn();
        }
        DeviceManager25 deviceManager25 = new DeviceManager25();
        double average = deviceManager25.getAveragePower(devices);
        int count = deviceManager25.countAboveAverage(devices, average);
        System.out.println();
        System.out.println("평균 전력 사용량 : " + average);
        System.out.println("평균 이상 기기 개수 : " + count);
    }
}
