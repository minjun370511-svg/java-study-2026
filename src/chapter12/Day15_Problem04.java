package chapter12;

// System 클래스
// 프로그램 실행 시간을 측정하기
public class Day15_Problem04 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        long sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();
        System.out.println("합계 : " + sum);
        System.out.println("실행 시간 : " + (time2 - time1) + "ns");
    }
}
