package chapter07;

// 추상 클래스 + 다형성 + 최대값 찾기
// 직원 배열에서 가장 높은 급여를 받는 직원을 찾으세요.
abstract class Employee16 {
    String name;
    int salary;

    Employee16(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer16 extends Employee16 {
    String language;

    Developer16(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer16 extends Employee16 {
    String tool;

    Designer16(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day09_Problem16 {
    public static void main(String[] args) {
        Employee16[] employee16s = {
                new Developer16("김개발", 4000, "Java"),
                new Designer16("이디자인", 3500, "Figma"),
                new Developer16("박개발", 5000, "Spring"),
                new Designer16("최디자인", 3200, "Photoshop")
        };
        Employee16 topSalary = employee16s[0];
        for (Employee16 employee16 : employee16s) {
            employee16.work();
            if (employee16.salary > topSalary.salary) {
                topSalary = employee16;
            }
        }
        System.out.println();
        System.out.println("최고 급여 직원 : " + topSalary.name);
        System.out.println("급여 : " + topSalary.salary);
    }
}
