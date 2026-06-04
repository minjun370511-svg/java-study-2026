package chapter04;

import java.util.Scanner;

public class Day03_Problem25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                continue;
            }
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("개수 : " + count);
        System.out.println("합계 : " + sum);
    }
}
