package chapter11;

// 사용자 정의 예외 만들기
// 직접 만든 예외 클래스를 사용하여 예외 처리하기
class InvalidAgeException extends Exception {
}

public class Day14_Problem08 {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException();
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("잘못된 나이 입니다.");
        }
    }
}
