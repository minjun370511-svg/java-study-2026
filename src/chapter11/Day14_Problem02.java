package chapter11;

// try-catch 사용하기
// 배열 인덱스 예외를 처리하고 프로그램을 계속 실행하기
public class Day14_Problem02 {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("잘못된 인덱스에 접근했습니다.");
            System.out.println("프로그램 종료");
        }
    }
}
