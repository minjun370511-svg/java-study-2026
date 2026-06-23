package chapter12;

// String 클래스
// 앞뒤 공백 제거 후 문자열 길이 구하기
class TextInfo11 {
    String text;

    TextInfo11(String text) {
        this.text = text;
    }

    public int getTrimmedLength() {
        return text.trim().length();
    }
}

public class Day15_Problem11 {
    public static void main(String[] args) {
        TextInfo11 t1 = new TextInfo11("   Java   ");
        TextInfo11 t2 = new TextInfo11("     Spring Boot     ");
        System.out.println(t1.getTrimmedLength());
        System.out.println(t2.getTrimmedLength());
    }
}
