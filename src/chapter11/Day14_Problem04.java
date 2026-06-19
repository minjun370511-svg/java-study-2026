package chapter11;

// 여러 개의 catch 사용하기
// 발생한 예외 종류에 따라 다른 메시지를 출력하기
public class Day14_Problem04 {
    public static void main(String[] args) {
        String[] data = {"10", "20", "ABC"};
        try {
            System.out.println(data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 오류 발생");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 오류 발생");
        }
        try {
            int num = Integer.parseInt(data[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱스 오류 발생");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 오류 발생");
        }
    }
}
