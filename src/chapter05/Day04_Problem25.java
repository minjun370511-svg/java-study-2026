package chapter05;

public class Day04_Problem25 {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 85, 77, 100},
                {70, 95, 88, 92},
                {100, 100, 95, 98}
        };
        int bestScore = scores[0][0];
        int bestStudent = 1;
        int bestSubject = 1;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                if (scores[i][j] > bestScore) {
                    bestScore = scores[i][j];
                    bestStudent = i + 1;
                    bestSubject = j + 1;
                }
            }
        }
        System.out.println("최고 점수 : " + bestScore);
        System.out.println("학생 : " + bestStudent + "번");
        System.out.println("과목 : " + bestSubject + "번");
    }
}
