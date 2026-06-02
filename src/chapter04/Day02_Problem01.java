package chapter04;

import java.util.Scanner;

public class Day02_Problem01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("0 또는 음수입니다.");
        }
    }
}
