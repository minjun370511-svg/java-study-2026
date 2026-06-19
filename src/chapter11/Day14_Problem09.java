package chapter11;

// 예외 처리 종합하기
// 사용자 정의 예외를 발생시키고 처리하여 회원 가입 검증하기
class InvalidAgeException09 extends Exception {

}

public class Day14_Problem09 {
    public static void register(int age) throws InvalidAgeException09 {
        if (age < 0) {
            throw new InvalidAgeException09();
        } else {
            System.out.println("회원 가입 완료");
        }
    }

    public static void main(String[] args) {
        try {
            register(20);
        } catch (InvalidAgeException09 e) {
            System.out.println("잘못된 나이입니다.");
        }
        try {
            register(-5);
        } catch (InvalidAgeException09 e) {
            System.out.println("잘못된 나이입니다.");
        }
    }
}
