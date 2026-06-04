package chapter05;

import java.util.Scanner;

public class Day03_Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++) {
            int n = sc.nextInt();
            scores[i] = n;
        }
        for (int j = 0; j < scores.length; j++) {
            System.out.println(scores[j]);
        }
    }
}
