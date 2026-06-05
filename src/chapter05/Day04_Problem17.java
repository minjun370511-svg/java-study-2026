package chapter05;

import java.util.Scanner;

public class Day04_Problem17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        char first = str.charAt(0);
        char last = str.charAt(length - 1);
        System.out.println("길이 : " + length);
        System.out.println("첫 문자 : " + first);
        System.out.println("마지막 문자 : " + last);

    }
}
