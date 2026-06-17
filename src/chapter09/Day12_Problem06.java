package chapter09;

// 익명 객체 매개변수 전달
// Worker06 클래스의 work() 메서드에 익명 구현 객체를 전달하기
interface Job06 {
    void doWork();
}

class Worker06 {
    void work(Job06 job06) {
        job06.doWork();
    }
}

public class Day12_Problem06 {
    public static void main(String[] args) {
        Worker06 worker06 = new Worker06();
        worker06.work(new Job06() {
            @Override
            public void doWork() {
                System.out.println("데이터 전처리 작업 수행");
            }
        });
    }
}
