package chapter05;

//가장 긴 단어와 가장 짧은 단어를 모두 출력//
public class Day05_Problem44 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "kiwi",
                "grape",
                "melon",
                "watermelon"
        };
        String maxWord = words[0];
        int maxLength = words[0].length();
        String minWord = words[0];
        int minLength = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxWord = words[i];
                maxLength = words[i].length();
            }
            if (words[i].length() < minLength) {
                minWord = words[i];
                minLength = words[i].length();
            }
        }
        System.out.println("가장 긴 단어 : " + maxWord);
        System.out.println("길이 : " + maxLength);
        System.out.println();
        System.out.println("가장 짧은 단어 : " + minWord);
        System.out.println("길이 : " + minLength);
    }
}
