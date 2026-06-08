package chapter05;

public class Day05_Problem33 {
    public static void main(String[] args) {
        String[] words = {
                "apple",
                "banana",
                "avocado",
                "grape",
                "apricot",
                "blueberry",
                "cherry"
        };
        char firstLetter = words[0].charAt(0);
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (words[j].charAt(0) == words[i].charAt(0)) {
                    dup = true;
                    break;
                } else {
                    dup = false;
                    firstLetter = words[i].charAt(0);
                }
            }
            if (dup == false) {
                for (int j = 0; j < words.length; j++) {
                    if (firstLetter == words[j].charAt(0)) {
                        count++;
                    }
                }
                System.out.println(firstLetter + " : " + count);
            }
            count = 0;

        }
    }
}
