package chapter05;

public class Day05_Problem40 {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 85, 77},
                {70, 95, 88},
                {100, 100, 95},
                {80, 75, 90}
        };
        int[] sum = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int sumScore = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sumScore += scores[i][j];
            }
            sum[i] = sumScore;
        }
        int maxScore = sum[0];
        int maxIndex = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > maxScore) {
                maxScore = sum[i];
                maxIndex = i;
            }
        }
        int secondMax = 0;
        int secondIndex=0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] == maxScore) {
                continue;
            } else {
                if (sum[i] > secondMax) {
                    secondMax = sum[i];
                    secondIndex = i;
                }
            }
        }
        System.out.println("1등 학생 : " + (maxIndex+1) + "번");
        System.out.println("총점 : " + maxScore);
        System.out.println();
        System.out.println("2등 학생 : " + (secondIndex+1) + "번");
        System.out.println("총점 : " + secondMax);
    }
}
