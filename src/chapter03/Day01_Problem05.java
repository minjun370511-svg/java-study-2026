package chapter03;

import java.util.Scanner;

public class Day01_Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();
        System.out.println("짝수 여부 :" + (number % 2 == 0));
        System.out.print("숫자 입력 : ");
        int number2 = sc.nextInt();
        System.out.println("짝수 여부 :" + (number2 % 2 == 0));
    }
}
