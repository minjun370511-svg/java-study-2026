package chapter05;

public class Day05_Problem36 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "kiwi",
                "grape",
                "melon"
        };
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String maxWords = words[0];
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                for (int k = 0; k < vowels.length; k++) {
                    if (words[i].charAt(j) == vowels[k]) {
                        count++;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxWords = words[i];
            }
            count = 0;
        }
        System.out.println("가장 많은 모음을 가진 단어 : " + maxWords);
        System.out.println("모음 개수 : " + maxCount);
    }
}
