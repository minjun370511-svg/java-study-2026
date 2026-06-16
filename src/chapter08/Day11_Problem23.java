package chapter08;

// 인터페이스 배열에서 최저 전력 기기 찾기
// DeviceManager23이 가장 전력 사용량이 낮은 기기를 찾아 반환하기
interface Device23 {
    void powerOn();

    int getPowerUsage();
}

class TV23 implements Device23 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio23 implements Device23 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner23 implements Device23 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator23 implements Device23 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class DeviceManager23 {
    Device23 findMinPowerDevice(Device23[] device23s) {
        Device23 minDevice = null;
        for (Device23 device23 : device23s) {
            if (minDevice == null) {
                minDevice = device23;
            } else {
                if (device23.getPowerUsage() < minDevice.getPowerUsage()) {
                    minDevice = device23;
                }
            }
        }
        return minDevice;
    }
}

public class Day11_Problem23 {
    public static void main(String[] args) {
        Device23[] devices = {
                new TV23(),
                new Audio23(),
                new AirConditioner23(),
                new Refrigerator23()
        };
        for (Device23 device23 : devices) {
            device23.powerOn();
        }
        DeviceManager23 deviceManager23 = new DeviceManager23();
        Device23 minPowerDevice = deviceManager23.findMinPowerDevice(devices);
        System.out.println();
        System.out.println("최저 전력 기기 : " + minPowerDevice.getClass().getSimpleName());
        System.out.println("전력 사용량 : " + minPowerDevice.getPowerUsage());
    }
}
