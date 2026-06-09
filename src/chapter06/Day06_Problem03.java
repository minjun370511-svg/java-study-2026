package chapter06;

//학생 정보를 출력하는 메서드를 만들어라.//
class Student3 {
    String name;
    int age;

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

public class Day06_Problem03 {
    public static void main(String[] args) {
        Student3 student = new Student3("민준", 27);
        student.printInfo();
    }
}
