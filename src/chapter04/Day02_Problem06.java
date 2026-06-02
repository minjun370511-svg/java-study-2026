package chapter04;

import java.util.Scanner;

public class Day02_Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 3개 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest;
        if ((a >= b) && (a >= c)) {
            largest = a;
        } else if ((b >= a) && (b >= c)) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("가장 큰 수 : " + largest);
    }
}
