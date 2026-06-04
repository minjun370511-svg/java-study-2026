package chapter05;

import java.util.Scanner;

public class Day03_Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        int min = scores[0];
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] > max) {
                max = scores[j];
            }
            if (scores[j] < min) {
                min = scores[j];
            }

        }
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }
}
