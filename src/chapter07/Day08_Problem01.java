package chapter07;

// 상속(Inheritance)
// Person 클래스를 상속받아 Student 클래스를 만들고 정보를 출력하세요.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void showStudentInfo() {
        showInfo();
        System.out.println("학년 : " + grade);
    }
}

public class Day08_Problem01 {
    public static void main(String[] args) {
        Student student = new Student("홍길동", 20, 2);
        student.showStudentInfo();
    }
}
