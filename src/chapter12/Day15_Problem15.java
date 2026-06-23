package chapter12;

// String 클래스
// 문자열에서 가장 많이 등장한 문자 찾기
class MostFrequentChar15 {
    String text;

    MostFrequentChar15(String text) {
        this.text = text;
    }

    public char getMostFrequentChar() {
        String newText = text.toLowerCase().replace(" ", "");

        int maxCount = 0;
        char maxChar = newText.charAt(0);

        for (int i = 0; i < newText.length(); i++) {
            int count = 0;

            for (int j = 0; j < newText.length(); j++) {
                if (newText.charAt(i) == newText.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = newText.charAt(i);
            }
        }

        return maxChar;
    }
}

public class Day15_Problem15 {
    public static void main(String[] args) {
        MostFrequentChar15 m1 =
                new MostFrequentChar15("banana");

        MostFrequentChar15 m2 =
                new MostFrequentChar15("Java Programming");
        System.out.println(m1.getMostFrequentChar());
        System.out.println(m2.getMostFrequentChar());
    }
}
