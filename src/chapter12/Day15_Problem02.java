package chapter12;

// Object 클래스
// hashCode()를 오버라이딩하여 학생 객체의 해시코드 만들기
class Student02 {
    String studentId;
    String name;

    Student02(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student02 target) {
            return studentId.equals(target.studentId);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hashCode = studentId.hashCode();
        return hashCode;
    }
}

public class Day15_Problem02 {
    public static void main(String[] args) {
        Student02 s1 = new Student02("S001", "김민준");
        Student02 s2 = new Student02("S001", "민준");
        Student02 s3 = new Student02("S002", "김철수");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println();

        System.out.println(s1.equals(s3));
        System.out.println(s3.hashCode());
    }
}
