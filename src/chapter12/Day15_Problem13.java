package chapter12;

// String 클래스
// 문자열을 거꾸로 뒤집기
class ReverseText13 {
    String text;

    ReverseText13(String text) {
        this.text = text;
    }

    public String reverse() {
        String result = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }

        return result;
    }
}

public class Day15_Problem13 {
    public static void main(String[] args) {
        ReverseText13 r1 = new ReverseText13("Java");
        ReverseText13 r2 = new ReverseText13("Spring");
        String result1 = r1.reverse();
        String result2 = r2.reverse();
        System.out.println(result1);
        System.out.println(result2);
    }
}
