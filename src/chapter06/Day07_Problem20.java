package chapter06;

//객체 배열에서 최고 평균 찾기
//학생 객체 배열에서 평균 점수가 가장 높은 학생의 이름과 평균을 출력하시오.
class Student14 {
    String name;
    int kor;
    int eng;
    int math;

    Student14(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

}

public class Day07_Problem20 {
    public static void main(String[] args) {
        Student14[] students = {
                new Student14("민준", 90, 70, 80),
                new Student14("철수", 75, 85, 80),
                new Student14("영희", 100, 90, 95)
        };
        Student14 topStudent = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverage() > topStudent.getAverage()) {
                topStudent = students[i];
            }
        }
        System.out.println("가장 평균이 높은 학생 : " + topStudent.name);
        System.out.println("평균 : " + topStudent.getAverage());
    }
}
