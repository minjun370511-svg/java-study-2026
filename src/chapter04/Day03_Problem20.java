package chapter04;

import java.util.Scanner;

public class Day03_Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
