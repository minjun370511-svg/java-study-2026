package chapter11;

// throw 사용하기
// 조건에 따라 예외를 직접 발생시키기
public class Day14_Problem07 {
    public static void checkAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("나이는 음수가 될 수 없습니다.");
        }
    }
}