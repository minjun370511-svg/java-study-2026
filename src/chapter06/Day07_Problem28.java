package chapter06;

// 가장 높은 평균을 가진 학생의 학점 구하기
// 학생 객체 배열이 있을 때, 평균 점수가 가장 높은 학생의 이름과 학점을 출력하시오.
class Student22 {
    String name;
    int kor;
    int eng;
    int math;

    Student22(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

    String getGrade() {
        double avg = getAverage();
        if (avg >= 90) {
            return "A";
        } else if (avg >= 80) {
            return "B";
        } else if (avg >= 70) {
            return "C";
        } else if (avg >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

public class Day07_Problem28 {
    public static void main(String[] args) {
        Student22[] students = {
                new Student22("민준", 90, 70, 80),
                new Student22("철수", 75, 85, 80),
                new Student22("영희", 100, 90, 95),
                new Student22("지민", 40, 50, 45),
                new Student22("서연", 85, 80, 90)
        };
        Student22 topStudent = students[0];
        for (Student22 student : students) {
            if (student.getAverage() > topStudent.getAverage()) {
                topStudent = student;
            }
        }
        System.out.println("가장 높은 평균 학생");
        System.out.println("이름 : " + topStudent.name);
        System.out.println("평균 : " + topStudent.getAverage());
        System.out.println("학점 : " + topStudent.getGrade());
    }
}
