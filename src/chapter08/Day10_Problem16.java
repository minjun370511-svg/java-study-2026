package chapter08;

// 인터페이스 배열과 기능별 개수 세기
// TV와 Audio 개수 각각 구하기
interface Device16 {
    void powerOn();
}

class TV16 implements Device16 {
    @Override
    public void powerOn() {
        System.out.println("TV ON");
    }
}

class Audio16 implements Device16 {
    @Override
    public void powerOn() {
        System.out.println("Audio ON");
    }
}

public class Day10_Problem16 {
    public static void main(String[] args) {
        Device16[] devices = {
                new TV16(),
                new Audio16(),
                new TV16(),
                new TV16(),
                new Audio16(),
                new Audio16()
        };
        int countTV = 0;
        int countAudio = 0;
        for (Device16 device16 : devices) {
            device16.powerOn();
            if (device16 instanceof TV16 tv16) {
                countTV++;
            }
            if (device16 instanceof Audio16 audio16) {
                countAudio++;
            }
        }
        System.out.println();
        System.out.println("TV 개수 : " + countTV);
        System.out.println("Audio 개수 : " + countAudio);
    }
}
