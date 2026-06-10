package chapter06;

// 가장 성적이 많이 향상된 학생 찾기
// 학생 객체 배열에서 이전 시험 평균과 현재 시험 평균의 차이가 가장 큰 학생을 출력하시오.
class Student23 {
    String name;

    int prevKor;
    int prevEng;
    int prevMath;

    int nowKor;
    int nowEng;
    int nowMath;

    Student23(String name, int prevKor, int prevEng, int prevMath, int nowKor, int nowEng, int nowMath) {
        this.name = name;
        this.prevKor = prevKor;
        this.prevEng = prevEng;
        this.prevMath = prevMath;
        this.nowKor = nowKor;
        this.nowEng = nowEng;
        this.nowMath = nowMath;
    }

    double getPrevAverage() {
        return (prevKor + prevEng + prevMath) / 3.0;
    }

    double getNowAverage() {
        return (nowKor + nowEng + nowMath) / 3.0;
    }

    double getImprovement() {
        return getNowAverage() - getPrevAverage();
    }
}

public class Day07_Problem29 {
    public static void main(String[] args) {
        Student23[] students = {
                new Student23("민준", 70, 65, 75, 90, 80, 85),
                new Student23("철수", 80, 75, 85, 85, 80, 90),
                new Student23("영희", 60, 55, 65, 95, 90, 100),
                new Student23("지민", 75, 80, 70, 80, 85, 75),
                new Student23("서연", 90, 85, 95, 92, 88, 96)
        };
        Student23 topImprovementStudent = students[0];
        for (Student23 student : students) {
            if (student.getImprovement() > topImprovementStudent.getImprovement()) {
                topImprovementStudent = student;
            }
        }
        System.out.println("가장 성적이 많이 향상된 학생");
        System.out.println();
        System.out.println("이름 : " + topImprovementStudent.name);
        System.out.println("이전 평균 : " + topImprovementStudent.getPrevAverage());
        System.out.println("현재 평균 : " + topImprovementStudent.getNowAverage());
        System.out.println("향상폭 : " + topImprovementStudent.getImprovement());
    }
}
