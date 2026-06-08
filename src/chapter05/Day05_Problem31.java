package chapter05;

public class Day05_Problem31 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "avocado",
                "grape",
                "apricot",
                "blueberry"
        };
        char firstLetter = words[0].charAt(0);
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i; j < words.length; j++) {
                if (words[j].charAt(0) == words[i].charAt(0)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                firstLetter = words[i].charAt(0);
            }
            count = 0;
        }
        System.out.println("가장 많이 등장한 첫 글자 : " + firstLetter);
        System.out.println("등장 횟수 : " + maxCount);

    }
}
