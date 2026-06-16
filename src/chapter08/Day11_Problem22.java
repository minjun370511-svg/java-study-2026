package chapter08;

// 인터페이스 배열에서 조건에 맞는 기기 찾기
// DeviceManager22가 기준 전력 이상인 첫 번째 기기를 반환하기
interface Device22 {
    void powerOn();

    int getPowerUsage();
}

class TV22 implements Device22 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio22 implements Device22 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner22 implements Device22 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator22 implements Device22 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class DeviceManager22 {
    Device22 findFirstHighPowerDevice(Device22[] devices, int standardPower) {
        Device22 firstDevice = null;
        for (Device22 device22 : devices) {
            if (device22.getPowerUsage() >= standardPower) {
                firstDevice = device22;
                break;
            }
        }
        return firstDevice;
    }
}

public class Day11_Problem22 {
    public static void main(String[] args) {
        Device22[] devices = {
                new Audio22(),
                new TV22(),
                new Refrigerator22(),
                new AirConditioner22()
        };
        int standardPower = 250;
        DeviceManager22 deviceManager22 = new DeviceManager22();
        Device22 firstDevice = deviceManager22.findFirstHighPowerDevice(devices, standardPower);
        System.out.println("기준 전력 : " + standardPower);
        System.out.println("기준 이상 첫 번째 기기 : " + firstDevice.getClass().getSimpleName());
        System.out.println("전력 사용량 : " + firstDevice.getPowerUsage());
    }
}
