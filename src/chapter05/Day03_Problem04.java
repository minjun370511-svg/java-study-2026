package chapter05;

import java.util.Scanner;

public class Day03_Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= max) {
                max = scores[i];
            }
        }
        System.out.println("최대값 : " + max);
    }
}
