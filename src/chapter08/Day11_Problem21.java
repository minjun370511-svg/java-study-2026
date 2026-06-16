package chapter08;

// 인터페이스 배열에서 최고 전력 기기 반환하기
// DeviceManager21이 가장 전력 사용량이 높은 기기를 찾아 반환하기
interface Device21 {
    void powerOn();

    int getPowerUsage();
}

class TV21 implements Device21 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio21 implements Device21 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner21 implements Device21 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator21 implements Device21 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class DeviceManager21 {
    Device21 findMaxPowerDevice(Device21[] device21s) {
        Device21 max = null;
        for (Device21 device21 : device21s) {
            if (max == null) {
                max = device21;
            } else {
                if (device21.getPowerUsage() > max.getPowerUsage()) {
                    max = device21;
                }
            }
        }
        return max;
    }
}

public class Day11_Problem21 {
    public static void main(String[] args) {
        Device21[] device21s = {
                new TV21(),
                new Audio21(),
                new AirConditioner21(),
                new Refrigerator21()
        };
        for (Device21 device21 : device21s) {
            device21.powerOn();
        }
        DeviceManager21 deviceManager21 = new DeviceManager21();
        Device21 maxPowerDevice = deviceManager21.findMaxPowerDevice(device21s);
        System.out.println();
        System.out.println("최고 전력 기기 : " + maxPowerDevice.getClass().getSimpleName());
        System.out.println("전력 사용량 : " + maxPowerDevice.getPowerUsage());

    }
}
