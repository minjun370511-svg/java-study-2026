package chapter06;

//메서드 재사용을 통한 학점 계산
//학생의 평균 점수를 이용하여 학점을 반환하는 메서드를 작성하시오.
class Student10 {
    int kor;
    int eng;
    int math;

    Student10(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

    char getGrade() {
        if (getAverage() >= 90) {
            return 'A';
        } else if (getAverage() >= 80) {
            return 'B';
        } else if (getAverage() >= 70) {
            return 'C';
        } else if (getAverage() >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

public class Day06_Problem16 {
    public static void main(String[] args) {
        Student10 student = new Student10(90, 80, 100);
        System.out.println(student.getAverage());
        System.out.println(student.getGrade());
    }
}
