package chapter05;

import java.util.Scanner;

public class Day04_Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        char print;
        for (int i = 0; i < length; i++) {
            print = str.charAt(i);
            System.out.println(print);
        }
    }
}
