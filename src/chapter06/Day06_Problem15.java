package chapter06;

//계산 결과에 따른 상태 판별(boolean 반환)
//학생의 평균이 60점 이상이면 합격(true), 아니면 불합격(false)을 반환하는 메서드를 작성하시오.
class Student9 {
    private int kor;
    private int eng;
    private int math;

    Student9(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

    boolean isPassed() {
        return getAverage() >= 60;
    }
}

public class Day06_Problem15 {
    public static void main(String[] args) {
        Student9 student = new Student9(90, 80, 100);

        System.out.println(student.getAverage());
        System.out.println(student.isPassed());
    }
}
