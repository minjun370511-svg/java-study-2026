package chapter05;

import java.util.Scanner;

public class Day04_Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("차이 : " + diff);
    }
}
