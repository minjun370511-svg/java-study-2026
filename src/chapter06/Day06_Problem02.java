package chapter06;

//Student 클래스에 생성자를 추가하시오.//
class Student2 {
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Day06_Problem02 {
    public static void main(String[] args) {
        Student2 student2 = new Student2("민준", 27);
        System.out.println("이름 : " + student2.name);
        System.out.println("나이 : " + student2.age);
    }
}