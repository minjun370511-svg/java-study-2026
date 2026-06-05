package chapter05;

import java.util.Scanner;

public class Day04_Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dup = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    dup = 1;
                    break;
                }
            }
        }
        if (dup == 0) {
            System.out.println("모두 다른 수 입니다.");
        } else {
            System.out.println("중복된 수가 있습니다.");
        }
    }
}
