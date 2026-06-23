package chapter12;

// String 클래스
// 특정 단어가 포함되어 있는지 검사하기
class TextChecker08 {
    String text;

    TextChecker08(String text) {
        this.text = text;
    }

    public boolean containsWord(String word) {
        return text.contains(word);
    }
}

public class Day15_Problem08 {
    public static void main(String[] args) {
        TextChecker08 t = new TextChecker08(
                "Java is the best programming language"
        );
        System.out.println(t.containsWord("Java"));
        System.out.println(t.containsWord("best"));
        System.out.println(t.containsWord("Python"));
    }
}
