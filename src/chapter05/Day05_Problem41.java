package chapter05;

public class Day05_Problem41 {
    public static void main(String[] args) {
        int[][] scores = {
                {90, 85, 77},
                {70, 95, 88},
                {100, 100, 95},
                {80, 75, 90}
        };
        double[] avg = new double[scores[0].length];
        for (int i = 0; i < scores[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < scores.length; j++) {
                sum += scores[j][i];
            }
            avg[i] = (double) sum / scores.length;
            System.out.println((i + 1) + "과목 평균 : " + avg[i]);

        }
    }
}
