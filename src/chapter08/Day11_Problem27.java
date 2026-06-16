package chapter08;

// DeviceManager 최종 종합
// 전체 전력 통계와 평균 이상 기기 목록 출력하기
interface Device27 {
    void powerOn();

    int getPowerUsage();
}

class TV27 implements Device27 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio27 implements Device27 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner27 implements Device27 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator27 implements Device27 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class Computer27 implements Device27 {
    @Override
    public void powerOn() {
        System.out.println("Computer ON");
    }

    @Override
    public int getPowerUsage() {
        return 300;
    }
}

class DeviceManager27 {
    int getTotalPower(Device27[] device27s) {
        int total = 0;
        for (Device27 device27 : device27s) {
            total += device27.getPowerUsage();
        }
        return total;
    }

    double getAveragePower(Device27[] device27s) {
        return (double) getTotalPower(device27s) / device27s.length;
    }

    Device27 findMaxPowerDevice(Device27[] device27s) {
        Device27 max = device27s[0];
        for (Device27 device27 : device27s) {
            if (device27.getPowerUsage() > max.getPowerUsage()) {
                max = device27;
            }
        }
        return max;
    }

    Device27 findMinPowerDevice(Device27[] device27s) {
        Device27 min = device27s[0];
        for (Device27 device27 : device27s) {
            if (device27.getPowerUsage() < min.getPowerUsage()) {
                min = device27;
            }
        }
        return min;
    }

    void printAboveAverageDevices(Device27[] device27s, double average) {
        System.out.println("평균 이상 기기 목록");
        for (Device27 device27 : device27s) {
            if (device27.getPowerUsage() >= average) {
                System.out.println(device27.getClass().getSimpleName() + " (" + device27.getPowerUsage() + ")");
            }
        }
    }
}

public class Day11_Problem27 {
    public static void main(String[] args) {
        Device27[] devices = {
                new TV27(),
                new Audio27(),
                new AirConditioner27(),
                new Refrigerator27(),
                new Computer27()
        };
        for (Device27 device27 : devices) {
            device27.powerOn();
        }
        DeviceManager27 deviceManager27 = new DeviceManager27();
        int total = deviceManager27.getTotalPower(devices);
        double avg = deviceManager27.getAveragePower(devices);
        Device27 max = deviceManager27.findMaxPowerDevice(devices);
        Device27 min = deviceManager27.findMinPowerDevice(devices);
        System.out.println();
        System.out.println("전체 전력 사용량 : " + total);
        System.out.println("평균 전력 사용량 : " + avg);
        System.out.println("최고 전력 기기 : " + max.getClass().getSimpleName());
        System.out.println("최저 전력 기기 : " + min.getClass().getSimpleName());
        System.out.println();
        deviceManager27.printAboveAverageDevices(devices, avg);
    }
}
