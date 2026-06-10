package chapter06;

//객체 배열에서 합격 학생 수 세기
//학생 객체 배열에서 평균이 60점 이상인 학생의 수를 출력하시오.
class Student16 {
    String name;
    int kor;
    int eng;
    int math;

    Student16(String name, int kor, int eng, int math) {
        this.name = name;
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

public class Day07_Problem22 {
    public static void main(String[] args) {
        Student16[] students = {
                new Student16("민준", 90, 70, 80),
                new Student16("철수", 50, 55, 60),
                new Student16("영희", 100, 90, 95),
                new Student16("지민", 40, 50, 45)
        };
        int passCount = 0;
        for (Student16 student : students) {
            if (student.isPassed()) {
                passCount++;
            }
        }
        System.out.println("합격 학생 수 : " + passCount + "명");
    }
}
