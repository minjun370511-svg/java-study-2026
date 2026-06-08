package chapter05;

//배열에서 중복된 단어는 한 번만 출력하시오. 출력 순서는 처음 등장한 순서를 유지한다.//
public class Day05_Problem43 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "apple",
                "kiwi",
                "banana",
                "grape",
                "kiwi",
                "melon"
        };
        for (int i = 0; i < words.length; i++) {
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    dup = true;
                    break;
                }
            }
            if (!dup) {
                System.out.println(words[i]);
            }
        }
    }
}
