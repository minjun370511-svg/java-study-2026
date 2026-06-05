package chapter05;

import java.util.Scanner;

public class Day04_Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowel.length; j++) {
                if (vowel[j] == str.charAt(i)) {
                    count++;
                }
            }
        }
        System.out.println("모음 개수 : " + count);
    }
}
