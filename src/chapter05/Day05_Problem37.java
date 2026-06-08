package chapter05;

public class Day05_Problem37 {
    public static void main(String[] args) {
        String[] words = {
                "level",
                "apple",
                "radar",
                "banana",
                "madam",
                "grape",
                "rotator"
        };
        String maxWords = words[0];
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            boolean palindrome = true;
            for (int j = 0; j < words[i].length() / 2; j++) {
                if (words[i].charAt(j) != words[i].charAt(words[i].length() - j - 1)) {
                    palindrome = false;
                    break;
                }
            }
            if (palindrome) {
                if (words[i].length() > maxLength) {
                    maxLength = words[i].length();
                    maxWords = words[i];
                }
            }
        }
        System.out.println("가장 긴 회문 단어 : " + maxWords);
        System.out.println("길이 : " + maxLength);
    }
}
