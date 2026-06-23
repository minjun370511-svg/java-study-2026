package chapter12;

// Object 클래스
// equals()를 오버라이딩하여 학생 객체 비교하기
class Student01 {
    String studentId;
    String name;

    Student01(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student01 target) {
            if (studentId.equals(target.studentId)) {
                return true;
            }
        }
        return false;
    }
}

public class Day15_Problem01 {
    public static void main(String[] args) {
        Student01 s1 = new Student01("S001", "김민준");
        Student01 s2 = new Student01("S001", "민준");
        Student01 s3 = new Student01("S002", "김철수");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
