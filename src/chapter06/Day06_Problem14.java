package chapter06;

//Getter를 이용한 계산 결과 반환
//학생의 평균 점수를 계산하는 메서드를 작성하시오.
class Student8 {
    private int kor;
    private int eng;
    private int math;

    Student8(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        int sum = kor + eng + math;
        double avg = (double) sum / 3.0;
        return avg;
    }
}

public class Day06_Problem14 {
    public static void main(String[] args) {
        Student8 student = new Student8(90, 80, 100);

        System.out.println(student.getAverage());
    }
}
