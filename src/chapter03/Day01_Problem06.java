package chapter03;

import java.util.Scanner;

public class Day01_Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        int firstnumber = sc.nextInt();
        System.out.print("두 번째 수 : ");
        int secondnumber = sc.nextInt();
        System.out.println("합 : " + (firstnumber + secondnumber));
        System.out.println("차 : " + (firstnumber - secondnumber));
        System.out.println("곱 : " + (firstnumber * secondnumber));
        System.out.println("몫 : " + (firstnumber / secondnumber));
        System.out.println("나머지 : " + (firstnumber % secondnumber));


    }
}
