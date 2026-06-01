package chapter02;

import java.util.Scanner;

public class Day01_Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 입력: ");
        int korean = sc.nextInt();
        System.out.print("영어 점수 입력: ");
        int english = sc.nextInt();
        System.out.print("수학 점수 입력: ");
        int math = sc.nextInt();
        int total = korean + english + math;
        double average = total / 3.0;
        System.out.println();
        System.out.println();
        System.out.println("총점: " + total);
        System.out.printf("평균: %.2f", average);


    }
}
