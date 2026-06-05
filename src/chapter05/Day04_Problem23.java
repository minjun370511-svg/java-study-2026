package chapter05;

import java.util.Scanner;

public class Day04_Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int seqCount = 1;
        int maxSeq = 1;
        char maxCh = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                seqCount++;
            } else {
                if (seqCount > maxSeq) {
                    maxSeq = seqCount;
                    maxCh = str.charAt(i - 1);
                }
                seqCount = 1;
            }
        }
        if (seqCount > maxSeq) {
            maxSeq = seqCount;
            maxCh = str.charAt(str.length() - 1);
        }
        System.out.println(maxCh + " : " + maxSeq);
    }
}
