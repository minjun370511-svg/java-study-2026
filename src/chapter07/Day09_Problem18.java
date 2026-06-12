package chapter07;

// 다형성 + 평균 이상 필터링
// 학생 배열에서 평균 이상 점수를 받은 학생만 출력하세요.
abstract class Student18 {
    String name;
    int score;

    Student18(String name, int score) {
        this.name = name;
        this.score = score;
    }

    abstract void introduce();
}

class MiddleStudent18 extends Student18 {
    String grade;

    MiddleStudent18(String name, int score, String grade) {
        super(name, score);
        this.grade = grade;
    }

    @Override
    void introduce() {
        System.out.println("중학생 " + name + " " + grade);
    }
}

class HighStudent18 extends Student18 {
    String major;

    HighStudent18(String name, int score, String major) {
        super(name, score);
        this.major = major;
    }

    @Override
    void introduce() {
        System.out.println("고등학생 " + name + " " + major);
    }
}

public class Day09_Problem18 {
    public static void main(String[] args) {
        Student18[] student18s = {
                new MiddleStudent18("김민준", 85, "중2"),
                new HighStudent18("이수민", 92, "AI"),
                new MiddleStudent18("박준호", 78, "중3"),
                new HighStudent18("최유진", 97, "SW")
        };
        int sum = 0;
        for (Student18 student18 : student18s) {
            sum += student18.score;
        }
        double avg = (double) sum / student18s.length;
        System.out.println("전체 평균 : " + avg);
        System.out.println();
        System.out.println("평균 이상 학생");
        for (Student18 student18 : student18s) {
            if (student18.score >= avg) {
                student18.introduce();
            }
        }

    }
}
