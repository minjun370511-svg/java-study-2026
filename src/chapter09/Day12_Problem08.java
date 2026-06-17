package chapter09;

// 익명 객체 활용
// Button08 클래스의 click() 메서드에 익명 구현 객체를 전달하여 버튼 클릭 이벤트 처리하기
interface ClickListener08 {
    void onClick();
}

class Button08 {
    void Click(ClickListener08 listener08) {
        System.out.println("버튼 클릭");
        listener08.onClick();
    }
}

public class Day12_Problem08 {
    public static void main(String[] args) {
        Button08 button08 = new Button08();
        button08.Click(new ClickListener08() {
            @Override
            public void onClick() {
                System.out.println("로그인 처리");
            }
        });
    }
}
