package chapter06;

// 학급 성적 분석 종합 프로그램
// 학생 객체 배열을 이용해 전체 평균, 최고 평균 학생, 최저 평균 학생, A학점 학생 수, 합격 학생 수를 출력하시오.
class Student27 {
    String name;
    int kor;
    int eng;
    int math;

    Student27(String name, int kor, int eng, int math) {
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

    boolean isPassed() {
        return getAverage()>=60;
    }
}

public class Day07_Problem33 {
    public static void main(String[] args) {
        Student27[] students = {
                new Student27("민준", 90, 70, 80),
                new Student27("철수", 75, 85, 80),
                new Student27("영희", 100, 90, 95),
                new Student27("지민", 40, 50, 45),
                new Student27("서연", 85, 80, 90)
        };
        double sum = 0;
        Student27 topAvg = students[0];
        Student27 bottomAvg = students[0];
        int aCount = 0;
        int passCount = 0;
        for (Student27 student : students) {
            sum += student.getAverage();
            if (student.getAverage() > topAvg.getAverage()) {
                topAvg = student;
            }
            if (student.getAverage() < bottomAvg.getAverage()) {
                bottomAvg = student;
            }
            if (student.getGrade().equals("A")) {
                aCount++;
            }
            if (student.isPassed()) {
                passCount++;
            }
        }
        double allAvg = sum / students.length;
        System.out.println("학급 성적 분석 보고서");
        System.out.println();
        System.out.println("전체 평균 : " + allAvg);
        System.out.println();
        System.out.println("최고 평균 학생");
        System.out.println("이름 : " + topAvg.name);
        System.out.println("평균 : " + topAvg.getAverage());
        System.out.println("학점 : " + topAvg.getGrade());
        System.out.println();
        System.out.println("최저 평균 학생");
        System.out.println("이름 : " + bottomAvg.name);
        System.out.println("평균 : " + bottomAvg.getAverage());
        System.out.println("학점 : " + bottomAvg.getGrade());
        System.out.println();
        System.out.println("A학점 학생 수 : " + aCount + "명");
        System.out.println("합격 학생 수 : " + passCount + "명");
    }
}
