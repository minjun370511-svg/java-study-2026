package chapter06;
//학생 정보를 저장하는 Student 클래스를 작성하시오.//
class Student {
    String name;
    int age;
}

public class Day06_Problem01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "민준";
        student.age = 27;
        System.out.println("이름 : " + student.name);
        System.out.println("나이 : " + student.age);
    }
}
