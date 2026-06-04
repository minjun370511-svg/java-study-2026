package chapter04;

import java.util.Scanner;

public class Day03_Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("짝수 개수 : " + count);
        System.out.println("짝수 합 : " + sum);
    }
}
