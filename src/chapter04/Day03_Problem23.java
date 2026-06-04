package chapter04;

import java.util.Scanner;

public class Day03_Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("3의 배수 개수 : " + count);
        System.out.println("3의 배수 합 : " + sum);
    }
}
