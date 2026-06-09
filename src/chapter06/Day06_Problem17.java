package chapter06;

//생성자와 Setter 검증 함께 사용하기
//학생 점수를 저장할 때 0점 이상 100점 이하만 허용하도록 작성하시오.
class Student11 {
    private int score;

    Student11(int score) {
        this.score = score;
    }

    void setScore(int score) {
        if ((score >= 0) && (score <= 100)) {
            this.score = score;
        } else {
            System.out.println("점수는 0점 이상 100점 이하만 가능합니다.");
        }
    }

    int getScore() {
        return score;
    }
}

public class Day06_Problem17 {
    public static void main(String[] args) {
        Student11 student = new Student11(80);
        student.setScore(120);
        System.out.println(student.getScore());
    }
}
