package chapter05;

import java.util.Scanner;

public class Day03_Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
    }
}
