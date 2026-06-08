package chapter05;

public class Day05_Problem39 {
    public static void main(String[] args) {
        String[] names = {
                "Kim",
                "Lee",
                "Park",
                "Choi",
                "Jung"
        };

        int[] scores = {
                85,
                92,
                78,
                95,
                88
        };
        int maxScore = scores[0];
        int maxIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }
        }
        System.out.println("1등 학생 : " + names[maxIndex]);
        System.out.println("점수 : " + maxScore);
    }
}
