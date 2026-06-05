package chapter05;

import java.util.Scanner;

public class Day04_Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }
        System.out.println("최대값 : " + max);
        System.out.println("위치 : " + index);
    }
}
