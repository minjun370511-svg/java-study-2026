package chapter05;

public class Day05_Problem38 {
    public static void main(String[] args) {
        String[] names = {
                "Kim",
                "Lee",
                "Park",
                "Choi",
                "Jung"
        };

        int[] ages = {
                20,
                22,
                19,
                25,
                21
        };
        int maxAge = ages[0];
        int maxIndex = 0;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] > maxAge) {
                maxAge = ages[i];
                maxIndex = i;
            }
        }
        System.out.println("가장 나이가 많은 학생 : " + names[maxIndex]);
        System.out.println("나이 : " + maxAge);
    }
}
