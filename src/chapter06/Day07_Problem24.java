package chapter06;

// 과목별 평균 구하기
// 학생 객체 배열이 있을 때 국어, 영어, 수학의 평균 점수를 각각 출력하시오.
class Student18 {
    String name;
    int kor;
    int eng;
    int math;

    Student18(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Day07_Problem24 {
    public static void main(String[] args) {
        Student18[] students = {
                new Student18("민준", 90, 70, 80),
                new Student18("철수", 75, 85, 80),
                new Student18("영희", 100, 90, 95),
                new Student18("지민", 40, 50, 45)
        };
        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;
        for (Student18 student : students) {
            korSum += student.kor;
            engSum += student.eng;
            mathSum += student.math;
        }
        double korAverage = (double) korSum / students.length;
        double engAverage = (double) engSum / students.length;
        double mathAverage = (double) mathSum / students.length;
        System.out.println("국어 평균 : " + korAverage);
        System.out.println("영어 편균 : " + engAverage);
        System.out.println("수학 평균 : " + mathAverage);
    }
}
