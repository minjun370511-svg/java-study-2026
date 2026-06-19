package chapter11;

// throws 사용하기
// 예외를 직접 처리하지 않고 호출한 곳으로 넘기기
public class Day14_Problem06 {
    public static void main(String[] args) {
        convert("ABC");
    }

    public static void convert(String str) throws NumberFormatException {
        Integer.parseInt(str);
    }
}
