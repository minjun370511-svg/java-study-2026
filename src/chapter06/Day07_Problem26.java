package chapter06;

// 객체 배열에서 특정 조건을 만족하는 학생 찾기
// 학생 객체 배열에서 평균이 80점 이상이면서 수학 점수가 90점 이상인 학생의 이름과 평균을 출력하시오.
class Student20 {
    String name;
    int kor;
    int eng;
    int math;

    Student20(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }
}

public class Day07_Problem26 {
    public static void main(String[] args) {
        Student20[] students = {
                new Student20("민준", 90, 70, 80),
                new Student20("철수", 75, 85, 80),
                new Student20("영희", 100, 90, 95),
                new Student20("지민", 40, 50, 45),
                new Student20("서연", 85, 80, 90)
        };
        System.out.println("조건을 만족하는 학생");
        for (Student20 student : students) {
            if (student.getAverage() >= 80) {
                if (student.math >= 90) {
                    System.out.println(student.name + " : " + student.getAverage());
                }
            }
        }
    }
}
