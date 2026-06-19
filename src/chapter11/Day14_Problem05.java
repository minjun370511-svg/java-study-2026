package chapter11;

// finally 사용하기
// 예외 발생 여부와 상관없이 실행되는 코드를 확인하기
public class Day14_Problem05 {
    public static void main(String[] args) {
        String str = "100";
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("finally 실행");
        }
    }
}
