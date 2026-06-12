package chapter07;

// 다형성 + 다운캐스팅 + 평균 급여
// 개발자들의 평균 급여를 구하세요.
abstract class Employee19 {
    String name;
    int salary;

    Employee19(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer19 extends Employee19 {
    String language;

    Developer19(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer19 extends Employee19 {
    String tool;

    Designer19(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day09_Problem19 {
    public static void main(String[] args) {
        Employee19[] employee19s = {
                new Developer19("김개발", 4000, "Java"),
                new Designer19("이디자인", 3500, "Figma"),
                new Developer19("박개발", 5000, "Spring"),
                new Designer19("최디자인", 3200, "Photoshop"),
                new Developer19("정개발", 4500, "Python")
        };
        int count = 0;
        int sumSalary = 0;
        for (Employee19 employee19 : employee19s) {
            employee19.work();
            if (employee19 instanceof Developer19) {
                count++;
                sumSalary += employee19.salary;
            }
        }
        double avg = (double) sumSalary / count;
        System.out.println();
        System.out.println("개발자 수 : " + count);
        System.out.println("개발자 평균 급여 : " + avg);
    }
}
