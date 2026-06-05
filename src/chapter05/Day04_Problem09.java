package chapter05;

import java.util.Scanner;

public class Day04_Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dup = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[i] == arr[j]) {
                    dup++;
                    break;
                }
            }
        }
        if (dup > 0) {
            System.out.println("중복된 숫자가 있습니다.");
        } else {
            System.out.println("중복된 숫자가 없습니다.");
        }

    }
}
