package chapter04;

import java.util.Scanner;

public class Day03_Problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factor++;
            }
        }
        if (factor == 2) {
            System.out.println("소수 입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
