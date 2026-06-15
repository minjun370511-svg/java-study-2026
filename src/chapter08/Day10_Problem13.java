package chapter08;

// 인터페이스 참조 변경
// 리모컨 객체를 교체하며 TV와 Audio를 실행하기
interface RemoteControl13 {
    void turnOn();

    void turnOff();
}

class TV13 implements RemoteControl13 {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }
}

class Audio13 implements RemoteControl13 {
    @Override
    public void turnOn() {
        System.out.println("오디오를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }
}

public class Day10_Problem13 {
    public static void main(String[] args) {
        RemoteControl13 remoteControl13;
        remoteControl13 = new TV13();
        remoteControl13.turnOn();
        remoteControl13.turnOff();

        remoteControl13 = new Audio13();
        remoteControl13.turnOn();
        remoteControl13.turnOff();
    }
}
