package chapter05;

import java.util.Scanner;

public class Day04_Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean palindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {

            } else {
                palindrome = false;
                break;
            }
        }
        if (palindrome == true) {
            System.out.println("회문입니다.");
        } else {
            System.out.println("회문이 아닙니다.");
        }
    }
}
