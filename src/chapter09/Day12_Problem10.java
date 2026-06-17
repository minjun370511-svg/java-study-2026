package chapter09;

// 익명 객체와 필드
// Alarm10 클래스의 alarmTask 필드에 익명 구현 객체를 저장하고 실행하기
interface Task10 {
    void run();
}

class Alarm10 {
    Task10 alarmTask;

    Alarm10() {
        alarmTask = new Task10() {
            @Override
            public void run() {
                System.out.println("알람 실행");
                System.out.println("기상 준비");
            }
        };
    }

    void start() {
        alarmTask.run();
    }
}

public class Day12_Problem10 {
    public static void main(String[] args) {
        Alarm10 alarm10 = new Alarm10();
        alarm10.start();
    }
}
