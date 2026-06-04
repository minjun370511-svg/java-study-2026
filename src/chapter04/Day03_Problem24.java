package chapter04;

import java.util.Scanner;

public class Day03_Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("7의 배수 개수 : " + count);
    }
}
