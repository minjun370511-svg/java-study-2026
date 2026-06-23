package chapter12;

// String 클래스
// 문자열이 숫자로만 이루어져 있는지 검사하기
class NumberChecker12 {
    String text;

    NumberChecker12(String text) {
        this.text = text;
    }

    public boolean isNumber() {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < '0' || text.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}

public class Day15_Problem12 {
    public static void main(String[] args) {
        NumberChecker12 n1 = new NumberChecker12("12345");
        NumberChecker12 n2 = new NumberChecker12("12a45");
        NumberChecker12 n3 = new NumberChecker12("987654");
        System.out.println(n1.isNumber());
        System.out.println(n2.isNumber());
        System.out.println(n3.isNumber());
    }
}
