package chapter06;

//객체 배열에서 최고 점수 학생과 최저 점수 학생 찾기
//학생 객체 배열에서 평균 점수가 가장 높은 학생과 가장 낮은 학생의 이름과 평균 점수를 출력하시오.
class Student17 {
    String name;
    int kor;
    int eng;
    int math;

    Student17(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }
}

public class Day07_Problem23 {
    public static void main(String[] args) {
        Student17[] students = {
                new Student17("민준", 90, 70, 80),
                new Student17("철수", 75, 85, 80),
                new Student17("영희", 100, 90, 95),
                new Student17("지민", 40, 50, 45)
        };
        Student17 topStudent = students[0];
        Student17 bottomStudent = students[0];
        for (Student17 student : students) {
            if (student.getAverage() > topStudent.getAverage()) {
                topStudent = student;
            }
            if (student.getAverage() < bottomStudent.getAverage()) {
                bottomStudent = student;
            }
        }
        System.out.println("최고 평균 학생 : " + topStudent.name);
        System.out.println("평균 : " + topStudent.getAverage());
        System.out.println("최저 평균 학생 : " + bottomStudent.name);
        System.out.println("평균 : " + bottomStudent.getAverage());
    }
}
