package chapter05;

import java.util.Scanner;

public class Day04_Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int maxindex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxindex = i;
            }
        }
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == maxindex) {
                continue;
            }
            secondMax = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == maxindex) {
                continue;
            }
            if (arr[i] > secondMax) {
                secondMax = arr[i];
            }

        }
        System.out.println("두 번째로 큰 수 : " + secondMax);
    }
}
