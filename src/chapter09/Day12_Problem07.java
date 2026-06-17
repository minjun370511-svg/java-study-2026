package chapter09;

// 익명 객체와 지역변수
// Printer07 클래스에서 익명 객체가 지역변수를 사용하여 출력하기
interface Message07 {
    void print();
}

class Printer07 {
    void showMessage() {
        String message = "AI 개발자";
        Message07 message07 = new Message07() {
            @Override
            public void print() {
                System.out.println("목표 : " + message);
            }
        };
        message07.print();
    }
}

public class Day12_Problem07 {
    public static void main(String[] args) {
        new Printer07().showMessage();
    }
}
