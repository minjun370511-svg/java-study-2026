package chapter04;

import java.util.Scanner;

public class Day02_Problem04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        if (age < 0) {
            System.out.println("잘못된 입력입니다");
        } else if (age < 13) {
            System.out.println("어린이 요금");
        } else if (age < 19) {
            System.out.println("청소년 요금");
        } else {
            System.out.println("성인 요금");
        }
    }
}
