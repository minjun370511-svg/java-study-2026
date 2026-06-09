package chapter06;

//학생 이름을 변경할 수 있는 Setter 메서드를 작성하시오.
class Student6 {
    private String name;

    Student6(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

public class Day06_Problem11 {
    public static void main(String[] args) {
        Student6 student = new Student6("민준");
        System.out.println(student.getName());
        student.setName("철수");
        System.out.println(student.getName());
    }
}
