package chapter06;

//이름을 변경할 때 2글자 이상인 경우에만 변경되도록 하시오.
class Student7 {
    private String name;

    Student7(String name) {
        this.name = name;
    }

    public void setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
        } else {
            System.out.println("이름은 2글자 이상이어야 합니다.");
        }
    }

    String getName() {
        return name;
    }
}

public class Day06_Problem12 {
    public static void main(String[] args) {
        Student7 student = new Student7("민준");
        student.setName("김");
        System.out.println(student.getName());
    }
}
