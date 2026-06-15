package chapter08;

// 인터페이스 배열과 카운트
// 배열 안에 저장된 TV 개수 구하기
interface Device15 {
    void powerOn();
}

class TV15 implements Device15 {
    @Override
    public void powerOn() {
        System.out.println("TV 전원 ON");
    }
}

class Audio15 implements Device15 {
    @Override
    public void powerOn() {
        System.out.println("오디오 전원 ON");
    }
}

public class Day10_Problem15 {
    public static void main(String[] args) {
        Device15[] devices = {
                new TV15(),
                new Audio15(),
                new TV15(),
                new TV15(),
                new Audio15()
        };
        int count = 0;
        for (Device15 device15 : devices) {
            device15.powerOn();
            if (device15 instanceof TV15) {
                count++;
            }
        }
        System.out.println();
        System.out.println("TV 개수 : " + count);
    }
}
