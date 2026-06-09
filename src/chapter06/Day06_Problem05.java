package chapter06;

//학생이 성인인지 판별하는 메서드를 작성하시오.
class Student5 {
    String name;
    int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    boolean isAdult() {
        return age >= 20;
    }
}

public class Day06_Problem05 {
    public static void main(String[] args) {
        Student5 student1 = new Student5("민준", 27);
        Student5 student2 = new Student5("철수", 17);
        System.out.println(student1.isAdult());
        System.out.println(student2.isAdult());
    }
}
