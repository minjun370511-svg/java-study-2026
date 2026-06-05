package chapter05;

import java.util.Scanner;

public class Day04_Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dup = new int[5];
        int dupCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dupCount++;
                }
            }
            dup[i] = dupCount;
            dupCount = 0;
        }
        int dupMax = dup[0];
        int dupIndex = 0;
        for (int i = 0; i < dup.length; i++) {
            if (dup[i] > dupMax) {
                dupMax=dup[i];
                dupIndex = i;
            }
        }
        System.out.println("가장 많이 나온 수 : " + arr[dupIndex]);
        System.out.println("등장 횟수 : " + dup[dupIndex]);
    }
}
