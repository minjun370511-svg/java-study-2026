package chapter11;

// 예외 처리 최종 종합
// 문자열 점수 배열을 검사하고 예외를 처리하여 평균 계산하기
class InvalidScoreException extends Exception {

}

public class Day14_Problem10 {
    public static int convertScore(String score) throws InvalidScoreException {
        int num = Integer.parseInt(score);
        if (num < 0 || num > 100) {
            throw new InvalidScoreException();
        }
        return num;
    }

    public static void main(String[] args) {
        String[] scores = {"90", "80", "ABC", "70"};
        try {
            int sum = 0;
            int count = 0;
            for (int i = 0; i < scores.length; i++) {
                try {
                    int score = convertScore(scores[i]);
                    System.out.println(score + "점 추가");
                    sum += score;
                    count++;
                } catch (InvalidScoreException e) {
                    System.out.println("잘못된 점수입니다.");
                } catch (NumberFormatException e) {
                    System.out.println("숫자로 변환할 수 없는 점수입니다.");
                }
            }
            double avg = (double) sum / count;
            System.out.printf("평균 점수 : %.2f", avg);
            System.out.println();
        } finally {
            System.out.println("점수 검사 완료");
        }
    }
}
