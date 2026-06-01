package chapter02;

public class Day01_Problem07 {
    public static void main(String[] args) {
        int korean = 87;
        int english = 92;
        int math = 78;
        int total = korean + english + math;
        double average = total / 3.0;
        System.out.println("총점 = " + total);
        System.out.printf("평균 = %.2f" , average);
    }
}
