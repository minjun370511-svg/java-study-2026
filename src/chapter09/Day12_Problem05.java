package chapter09;

// 익명 구현 객체
// Action05 인터페이스를 만들고 익명 객체로 실행하기
interface Action05 {
    void execute();
}

public class Day12_Problem05 {
    public static void main(String[] args) {
        Action05 action05 = new Action05() {
            @Override
            public void execute() {
                System.out.println("익명 객체 실행");
            }
        };
        action05.execute();
    }
}
