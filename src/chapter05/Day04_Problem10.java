package chapter05;

import java.util.Scanner;

public class Day04_Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dupCount = 0;
        int dupNum = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == dupNum) {
                dupCount++;
            }
        }
        System.out.println(dupNum + "은 " + dupCount + "개 있습니다.");
    }
}
