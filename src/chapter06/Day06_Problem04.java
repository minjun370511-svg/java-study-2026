package chapter06;

//학생의 출생연도를 계산하는 메서드를 작성하시오.
class Student4 {
    String name;
    int age;

    Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getBirthYear() {
        int BirthYear = 2026 - age + 1;
        return BirthYear;
    }
}

public class Day06_Problem04 {
    public static void main(String[] args) {
        Student4 student = new Student4("민준", 27);
        System.out.println(student.getBirthYear());
    }
}
