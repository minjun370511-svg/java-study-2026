package chapter08;

// 인터페이스 배열과 참조 변경
// 여러 RemoteControl 객체를 배열에 저장하여 실행하기
interface RemoteControl14 {
    void turnOn();

    void turnOff();
}

class TV14 implements RemoteControl14 {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}

class Audio14 implements RemoteControl14 {
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }
}

class AirConditioner14 implements RemoteControl14 {
    @Override
    public void turnOn() {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨을 끕니다.");
    }
}

public class Day10_Problem14 {
    public static void main(String[] args) {
        RemoteControl14[] remoteControl14s = {
                new TV14(),
                new Audio14(),
                new AirConditioner14()
        };
        for (RemoteControl14 remoteControl14 : remoteControl14s) {
            remoteControl14.turnOn();
            remoteControl14.turnOff();
            System.out.println();
        }
    }
}
