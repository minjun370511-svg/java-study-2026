package chapter05;

public class Day05_Problem34 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "kiwi",
                "grape",
                "melon"
        };
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                for (int k = 0; k < vowels.length; k++) {
                    if (words[i].charAt(j) == vowels[k]) {
                        count++;
                    }
                }
            }
            System.out.println(words[i] + " : " + count);
            count = 0;
        }
    }
}
