package chapter02;

public class Day01_Problem05 {
    public static void main(String[] args) {
        int totalSeconds = 7384;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(totalSeconds + "는 " + hours + "시간 " + minutes + "분 " + seconds + "초입니다.");
    }
}
