package chapter05;

import java.util.Scanner;

public class Day04_Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                x = 1;
                break;
            }
        }
        if (x == 1) {
            System.out.println("오름차순이 아닙니다.");
        } else {
            System.out.println("오름차순 입니다.");
        }
    }
}
