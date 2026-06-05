package chapter05;

public class Day04_Problem26 {
    public static void main(String[] args) {
        String[] names = {
                "Kim",
                "Lee",
                "Park",
                "Choi",
                "Jeong",
                "Kang"
        };
        String longestName = names[0];
        int longestLength = names[0].length();
        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > longestLength) {
                longestName = names[i];
                longestLength = names[i].length();
            }
        }
        System.out.println("가장 긴 이름 : " + longestName);
        System.out.println("길이 : " + longestLength);
    }
}
