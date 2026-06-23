package chapter12;

// String 클래스
// 문자열을 단어 단위로 분리하기
class SentenceInfo10 {
    String sentence;

    SentenceInfo10(String sentence) {
        this.sentence = sentence;
    }

    public void printWords() {
        String[] newWords = sentence.split(" ");
        for (String newWord : newWords) {
            System.out.println(newWord);
        }
    }
}

public class Day15_Problem10 {
    public static void main(String[] args) {
        SentenceInfo10 s =
                new SentenceInfo10("Java is the best programming language");
        s.printWords();
    }
}
