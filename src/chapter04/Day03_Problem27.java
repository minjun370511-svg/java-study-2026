package chapter04;

import java.util.Scanner;

public class Day03_Problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for (int i = 1; i <= 4; i++) {
            int n = sc.nextInt();
            if (n >= max) {
                max = n;
            }
        }
        System.out.println("최대값 : " + max);
    }
}
