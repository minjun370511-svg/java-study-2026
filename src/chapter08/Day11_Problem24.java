package chapter08;

// 인터페이스 배열에서 기기 종류별 개수 세기
// DeviceManager24가 TV, Audio, AirConditioner, Refrigerator 개수를 출력하기
interface Device24 {
    void powerOn();

    int getPowerUsage();
}

class TV24 implements Device24 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }

    @Override
    public int getPowerUsage() {
        return 200;
    }
}

class Audio24 implements Device24 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }

    @Override
    public int getPowerUsage() {
        return 150;
    }
}

class AirConditioner24 implements Device24 {
    @Override
    public void powerOn() {
        System.out.println("AIR ON");
    }

    @Override
    public int getPowerUsage() {
        return 350;
    }
}

class Refrigerator24 implements Device24 {
    @Override
    public void powerOn() {
        System.out.println("Refrigerator ON");
    }

    @Override
    public int getPowerUsage() {
        return 250;
    }
}

class DeviceManager24 {
    void printDeviceCounts(Device24[] device24s) {
        int CountTV = 0;
        int CountAudio = 0;
        int CountAir = 0;
        int CountRefrigerator = 0;
        for (Device24 device24 : device24s) {
            if (device24 instanceof TV24) {
                CountTV++;
            } else if (device24 instanceof Audio24) {
                CountAudio++;
            } else if (device24 instanceof AirConditioner24) {
                CountAir++;
            } else if (device24 instanceof Refrigerator24) {
                CountRefrigerator++;
            }
        }
        System.out.println("TV 개수 : " + CountTV);
        System.out.println("Audio 개수 : " + CountAudio);
        System.out.println("AirConditioner 개수 : " + CountAir);
        System.out.println("Refrigerator 개수 : " + CountRefrigerator);
    }
}

public class Day11_Problem24 {
    public static void main(String[] args) {
        Device24[] devices = {
                new TV24(),
                new Audio24(),
                new AirConditioner24(),
                new Refrigerator24(),
                new TV24(),
                new Audio24(),
                new TV24()
        };
        for (Device24 device24 : devices) {
            device24.powerOn();
        }
        System.out.println();
        DeviceManager24 deviceManager24 = new DeviceManager24();
        deviceManager24.printDeviceCounts(devices);
    }
}
