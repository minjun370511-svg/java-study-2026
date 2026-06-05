package chapter05;

import java.util.Scanner;

public class Day04_Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                sum += arr[i];
            }
        }
        System.out.println("짝수 개수 : " + count);
        System.out.println("짝수 합 : " + sum);

    }
}
