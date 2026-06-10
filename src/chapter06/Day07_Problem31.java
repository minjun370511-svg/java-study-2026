package chapter06;

// 최고 성적 학생과 최저 성적 학생의 평균 차이 구하기
// 학생 객체 배열에서 평균 점수가 가장 높은 학생과 가장 낮은 학생을 찾고,
// 두 학생의 평균 점수 차이를 출력하시오.
class Student25 {
    String name;
    int kor;
    int eng;
    int math;

    Student25(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }
}

public class Day07_Problem31 {
    public static void main(String[] args) {
        Student25[] students = {
                new Student25("민준", 90, 70, 80),
                new Student25("철수", 75, 85, 80),
                new Student25("영희", 100, 90, 95),
                new Student25("지민", 40, 50, 45),
                new Student25("서연", 85, 80, 90)
        };
        Student25 topStudent = students[0];
        Student25 bottomStudent = students[0];
        for (Student25 student : students) {
            if (student.getAverage() > topStudent.getAverage()) {
                topStudent = student;
            }
            if (student.getAverage() < bottomStudent.getAverage()) {
                bottomStudent = student;
            }
        }
        double diff = topStudent.getAverage() - bottomStudent.getAverage();
        System.out.println("최고 성적 학생 : " + topStudent.name);
        System.out.println("평균 : " + topStudent.getAverage());
        System.out.println();
        System.out.println("최저 성적 학생 : " + bottomStudent.name);
        System.out.println("평균 : " + bottomStudent.getAverage());
        System.out.println();
        System.out.println("평균 차이 : " + diff);
    }
}
