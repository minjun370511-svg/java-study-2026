package chapter04;

import java.util.Scanner;

public class Day02_Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        if ((month <= 0) || (month > 12)) {
            System.out.println("잘못된 월 입니다");
        } else if ((month < 3) || (month > 11)) {
            System.out.println("겨울");
        } else if (month < 6) {
            System.out.println("봄");
        } else if (month < 9) {
            System.out.println("여름");
        } else {
            System.out.println("가을");
        }
    }
}
