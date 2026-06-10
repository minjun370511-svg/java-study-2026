package chapter06;

// 평균 80점 이상 학생의 수학 점수 합 구하기
// 학생 객체 배열이 있을 때, 평균이 80점 이상인 학생들의 수학 점수 합을 출력하시오.
class Student21 {
    String name;
    int kor;
    int eng;
    int math;

    Student21(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }
}

public class Day07_Problem27 {
    public static void main(String[] args) {
        Student21[] students = {
                new Student21("민준", 90, 70, 80),
                new Student21("철수", 75, 85, 80),
                new Student21("영희", 100, 90, 95),
                new Student21("지민", 40, 50, 45),
                new Student21("서연", 85, 80, 90)
        };
        int sumMath = 0;
        for (Student21 student : students) {
            if (student.getAverage() >= 80) {
                sumMath += student.math;
            }
        }
        System.out.println("평균 80점 이상 학생의 수학 점수 합");
        System.out.println(sumMath);
    }
}
