package chapter11;

// NumberFormatException 처리하기
// 문자열을 숫자로 변환할 때 발생하는 예외 처리하기
public class Day14_Problem03 {
    public static void main(String[] args) {
        String str = "100";
        int num = Integer.parseInt(str);

        try {
            String str2 = "ABC";
            int num2 = Integer.parseInt(str2);
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
            System.out.println("프로그램 계속 실행");
        }
    }
}
