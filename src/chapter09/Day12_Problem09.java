package chapter09;

// 익명 객체 재사용
// Button09 클래스에 서로 다른 익명 객체를 전달하여 다른 동작 수행하기
interface ClickListener09 {
    void onClick();
}

class Button09 {
    void click(ClickListener09 listener09) {
        System.out.println("버튼 클릭");
        listener09.onClick();
    }
}

public class Day12_Problem09 {
    public static void main(String[] args) {
        Button09 button09 = new Button09();
        button09.click(new ClickListener09() {
            @Override
            public void onClick() {
                System.out.println("로그인 처리");
            }
        });
        System.out.println();
        button09.click(new ClickListener09() {
            @Override
            public void onClick() {
                System.out.println("회원가입 처리");
            }
        });
    }
}
