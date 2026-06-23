package chapter12;

// String 클래스
// 특정 문자열을 다른 문자열로 변경하기
class ReplaceText09 {
    String text;

    ReplaceText09(String text) {
        this.text = text;
    }

    public String replaceWord(String oldWord, String newWord) {
        String newStr = text.replace(oldWord, newWord);
        return newStr;
    }
}

public class Day15_Problem09 {
    public static void main(String[] args) {
        ReplaceText09 r =
                new ReplaceText09("Java is difficult");
        System.out.println(r.replaceWord("difficult", "fun"));
        System.out.println(r.replaceWord("Java", "Python"));
    }
}
