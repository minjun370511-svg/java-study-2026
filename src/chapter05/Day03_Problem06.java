package chapter05;

import java.util.Scanner;

public class Day03_Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }
        for (int j = scores.length - 1; j >= 0; j--) {
            System.out.println(scores[j]);
        }

    }
}
