package chapter05;

public class Day05_Problem32 {
    public static void main(String[] args) {
        String[] words = {
                "level",
                "apple",
                "radar",
                "banana",
                "madam",
                "grape"
        };
        boolean palindrome = true;
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length() / 2; j++) {
                if (words[i].charAt(j) != words[i].charAt(words[i].length() - j - 1)) {
                    palindrome = false;
                    break;
                }
            }
            if (palindrome) {
                count++;
            }
            palindrome = true;
        }
        System.out.println("회문 개수 : " + count);
    }
}

