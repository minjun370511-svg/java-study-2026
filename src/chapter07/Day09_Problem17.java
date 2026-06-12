package chapter07;

// 추상 클래스 + 다형성 + 평균 계산
// 학생 배열에서 전체 평균 점수와 최고 점수 학생을 구하세요.
abstract class Student17 {
    String name;
    int score;

    Student17(String name, int score) {
        this.name = name;
        this.score = score;
    }

    abstract void introduce();
}

class MiddleStudent17 extends Student17 {
    String grade;

    MiddleStudent17(String name, int score, String grade) {
        super(name, score);
        this.grade = grade;
    }

    @Override
    void introduce() {
        System.out.println("중학생 " + name + " " + grade);
    }
}

class HighStudent17 extends Student17 {
    String major;

    HighStudent17(String name, int score, String major) {
        super(name, score);
        this.major = major;
    }

    @Override
    void introduce() {
        System.out.println("고등학생 " + name + " " + major);
    }
}

public class Day09_Problem17 {
    public static void main(String[] args) {
        Student17[] student17s = {
                new MiddleStudent17("김민준", 85, "중2"),
                new HighStudent17("이수민", 92, "AI"),
                new MiddleStudent17("박준호", 78, "중3"),
                new HighStudent17("최유진", 97, "SW")
        };
        int sum = 0;
        Student17 topScore = student17s[0];
        for (Student17 student17 : student17s) {
            student17.introduce();
            sum += student17.score;
            if (student17.score > topScore.score) {
                topScore = student17;
            }
        }
        double avg = (double) sum / student17s.length;
        System.out.println();
        System.out.println("전체 평균 : " + avg);
        System.out.println();
        System.out.println("최고 점수 학생 : " + topScore.name);
        System.out.println("점수 : " + topScore.score);

    }
}
