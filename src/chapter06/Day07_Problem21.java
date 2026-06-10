package chapter06;

//객체 배열에서 평균 이상 학생 찾기
//학생 객체 배열이 있을 때, 전체 학생의 평균 점수를 구한 뒤 평균 이상인 학생의 이름과 평균 점수를 출력하시오.
class Student15 {
    String name;
    int kor;
    int eng;
    int math;

    Student15(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }
}

public class Day07_Problem21 {
    public static void main(String[] args) {
        Student15[] students = {
                new Student15("민준", 90, 70, 80),
                new Student15("철수", 75, 85, 80),
                new Student15("영희", 100, 90, 95)
        };
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverage();
        }
        double allAverage = sum / (students.length);
        System.out.println("평균 이상 학생");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getAverage() >= allAverage) {
                System.out.println(students[i].name + " : " + students[i].getAverage());
            }
        }

    }
}
