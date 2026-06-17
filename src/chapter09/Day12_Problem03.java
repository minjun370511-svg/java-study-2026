package chapter09;

// 로컬 클래스
// Employee03 클래스의 work() 메서드 내부에 LocalWorker03 로컬 클래스를 선언하고 작업 정보를 출력하기
class Employee03 {
    String name;

    Employee03(String name) {
        this.name = name;
    }

    void work() {
        class LocalWorker03 {
            String task;

            LocalWorker03(String task) {
                this.task = task;
            }

            void showTask() {
                System.out.println("직원 : " + name);
                System.out.println("업무 : " + task);
            }
        }
        LocalWorker03 localWorker03 = new LocalWorker03("데이터 분석");
        localWorker03.showTask();
    }
}

public class Day12_Problem03 {
    public static void main(String[] args) {
        Employee03 employee03 = new Employee03("김민준");
        employee03.work();
    }
}
