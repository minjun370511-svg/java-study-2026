package chapter05;

public class Day05_Problem35 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "kiwi",
                "grape",
                "melon"
        };
        String reversed = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                reversed += words[i].charAt(words[i].length() - j - 1);
            }
            System.out.println(words[i] + " -> " + reversed);
            reversed = "";
        }

    }
}
