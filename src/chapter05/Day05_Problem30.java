package chapter05;

public class Day05_Problem30 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "kiwi",
                "watermelon",
                "grape"
        };
        int sum = 0;
        for (int i = 0; i < words.length; i++) {
            sum += words[i].length();
        }
        double avg = (double) sum / words.length;
        System.out.println("평균 길이 : " + avg);
        System.out.println("평균보다 긴 단어");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > avg) {
                System.out.println(words[i]);
            }
        }

    }
}
