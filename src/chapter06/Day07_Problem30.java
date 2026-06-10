package chapter06;

// 조건을 만족하는 학생들의 평균 구하기
// 학생 객체 배열에서 평균 점수가 80점 이상인 학생들만 골라,
// 그 학생들의 평균 점수의 평균을 출력하시오.
class Student24 {
    String name;
    int kor;
    int eng;
    int math;

    Student24(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }
}

public class Day07_Problem30 {
    public static void main(String[] args) {
        Student24[] students = {
                new Student24("민준", 90, 70, 80),
                new Student24("철수", 75, 85, 80),
                new Student24("영희", 100, 90, 95),
                new Student24("지민", 40, 50, 45),
                new Student24("서연", 85, 80, 90)
        };
        double sum = 0;
        int count = 0;
        for (Student24 student : students) {
            if (student.getAverage() >= 80) {
                sum += student.getAverage();
                count++;
            }
        }
        double avg = sum / count;
        System.out.println("평균 80점 이상 학생들의 평균");
        System.out.println("대상 학생 수 : " + count + "명");
        System.out.println("평균 점수 : " + avg);
    }
}
