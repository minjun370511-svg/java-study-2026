package chapter05;

import java.util.Scanner;

public class Day04_Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = {
                {90, 85, 77, 100},
                {70, 95, 88, 92},
                {100, 100, 95, 98}
        };
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }

            double avg = (double) sum / scores[i].length;

            System.out.println((i + 1) + "번 학생 총점 : " + sum);
            System.out.println((i + 1) + "번 학생 평균 : " + avg);
            System.out.println();
        }
    }
}
