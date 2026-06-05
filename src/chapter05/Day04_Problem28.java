package chapter05;

public class Day04_Problem28 {
    public static void main(String[] args) {
        int[] scores = {90, 85, 77, 100, 95};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = (double) sum / scores.length;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
    }
}
