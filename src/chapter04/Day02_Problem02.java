package chapter04;

import java.util.Scanner;

public class Day02_Problem02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 입력: ");
        int age = sc.nextInt();
        System.out.println("회원 여부 입력(true/false): ");
        boolean bl = sc.nextBoolean();
        if ((age >= 20) && (bl)) {
            System.out.println("\"입장 가능합니다.\"");
        } else {
            System.out.println("\"입장 불가능합니다.\"");
        }
    }
}
