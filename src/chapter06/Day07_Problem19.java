package chapter06;

//학생 객체 배열 활용
//학생 3명의 정보를 객체 배열에 저장하고 각 학생의 평균 점수를 출력하시오.
class Student13 {
    String name;
    int kor;
    int eng;
    int math;

    Student13(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    double getAverage() {
        return (kor + eng + math) / 3.0;
    }

    void printAvg() {
        System.out.println(name + " : " + getAverage());
    }
}

public class Day07_Problem19 {
    public static void main(String[] args) {
        Student13 student1 = new Student13("민준", 90, 70, 80);
        Student13 student2 = new Student13("철수", 75, 85, 80);
        Student13 student3 = new Student13("영희", 80, 90, 85);
        Student13[] students = {student1, student2, student3};
        for (int i = 0; i < students.length; i++) {
            students[i].printAvg();
        }

    }
}
