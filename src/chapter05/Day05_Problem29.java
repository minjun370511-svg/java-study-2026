package chapter05;

import java.nio.file.SimpleFileVisitor;

public class Day05_Problem29 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "kiwi",
                "watermelon",
                "grape"
        };
        String maxWord = words[0];
        int maxLength = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxWord = words[i];
                maxLength = words[i].length();
            }
        }
        System.out.println("가장 긴 단어 : " + maxWord);
        System.out.println("길이 : " + maxLength);
    }
}
