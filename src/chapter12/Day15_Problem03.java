package chapter12;

// Object 클래스
// toString()을 오버라이딩하여 학생 정보를 문자열로 출력하기
class Student03 {
    String studentId;
    String name;
    int score;

    Student03(String studentId, String name, int score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "학번 : " + studentId + ", 이름 : " + name + ", 점수 : " + score;
    }
}

public class Day15_Problem03 {
    public static void main(String[] args) {
        Student03 s1 = new Student03("S001", "김민준", 90);
        Student03 s2 = new Student03("S002", "김철수", 85);
        System.out.println(s1);
        System.out.println(s2);
    }
}
