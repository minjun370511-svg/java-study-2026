package chapter05;

public class Day05_Problem42 {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 85, 77},
                {70, 95, 88},
                {100, 100, 95},
                {80, 75, 90}
        };
        for (int i = 0; i < scores[0].length; i++) {
            int bestScore = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j][i] > bestScore) {
                    bestScore = scores[j][i];
                }
            }
            System.out.println((i + 1) + "과목 최고 점수 : " + bestScore);
        }
    }
}
