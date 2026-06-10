package chapter06;

// 과목별 최고 점수 학생 찾기
// 학생 객체 배열에서 국어, 영어, 수학 점수가 각각 가장 높은 학생의 이름과 점수를 출력하시오.
class Student26 {
    String name;
    int kor;
    int eng;
    int math;

    Student26(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}

public class Day07_Problem32 {
    public static void main(String[] args) {
        Student26[] students = {
                new Student26("민준", 90, 70, 80),
                new Student26("철수", 75, 85, 80),
                new Student26("영희", 100, 90, 95),
                new Student26("지민", 40, 50, 45),
                new Student26("서연", 85, 80, 90)
        };
        Student26 topKor = students[0];
        Student26 topEng = students[0];
        Student26 topMath = students[0];
        for (Student26 student : students) {
            if (student.kor > topKor.kor) {
                topKor = student;
            }
            if (student.eng > topEng.eng) {
                topEng = student;
            }
            if (student.math > topMath.math) {
                topMath = student;
            }
        }
        System.out.println("국어 1등 : " + topKor.name + " (" + topKor.kor + "점)");
        System.out.println("영어 1등 : " + topEng.name + " (" + topEng.eng + "점)");
        System.out.println("수학 1등 : " + topMath.name + " (" + topMath.math + "점)");
    }
}
