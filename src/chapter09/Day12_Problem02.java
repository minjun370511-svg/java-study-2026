package chapter09;

// 정적 멤버 클래스
// Computer 클래스 내부에 static Processor 클래스를 만들고 프로세서 정보를 출력하기
class Computer02 {
    String brand;

    Computer02(String brand) {
        this.brand = brand;
    }

    static class Processor02 {
        String cpuName;

        Processor02(String cpuName) {
            this.cpuName = cpuName;
        }

        void showInfo() {
            System.out.println("CPU : " + cpuName);
        }
    }
}

public class Day12_Problem02 {
    public static void main(String[] args) {
        Computer02 computer02 = new Computer02("Samsung");

        Computer02.Processor02 processor02 =
                new Computer02.Processor02("Intel i7");

        processor02.showInfo();
    }
}
