package chapter06;

// 과목별 최고 점수 구하기
// 학생 객체 배열이 있을 때 국어, 영어, 수학 과목의 최고 점수를 각각 출력하시오.
class Student19 {
    String name;
    int kor;
    int eng;
    int math;

    Student19(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Day07_Problem25 {
    public static void main(String[] args) {
        Student19[] students = {
                new Student19("민준", 90, 70, 80),
                new Student19("철수", 75, 85, 80),
                new Student19("영희", 100, 90, 95),
                new Student19("지민", 40, 50, 45)
        };
        int topKor = students[0].kor;
        int topEng = students[0].eng;
        int topMath = students[0].math;
        for (Student19 student : students) {
            if (student.kor > topKor) {
                topKor = student.kor;
            }
            if (student.eng > topEng) {
                topEng = student.eng;
            }
            if (student.math > topMath) {
                topMath = student.math;
            }
        }
        System.out.println("국어 최고 점수 : " + topKor);
        System.out.println("영어 최고 점수 : " + topEng);
        System.out.println("수학 최고 점수 : " + topMath);
    }
}
