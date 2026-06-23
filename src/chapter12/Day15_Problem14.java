package chapter12;

// String 클래스
// 문자열에서 특정 문자의 개수 세기
class CharacterCounter14 {
    String text;
    char target;

    CharacterCounter14(String text, char target) {
        this.text = text;
        this.target = target;
    }

    public int count() {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}

public class Day15_Problem14 {
    public static void main(String[] args) {
        CharacterCounter14 c1 =
                new CharacterCounter14("banana", 'a');

        CharacterCounter14 c2 =
                new CharacterCounter14("programming", 'm');
        System.out.println(c1.count());
        System.out.println(c2.count());
    }
}
