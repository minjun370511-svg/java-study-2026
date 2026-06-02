package chapter04;

import java.util.Scanner;

public class Day02_Problem07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = sc.nextInt();
        System.out.print("출석률 입력 : ");
        int att = sc.nextInt();
        boolean success = ((score >= 60) && (att >= 80));
        if (success) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
