package chapter07;

// 다형성 + 최고값 찾기 + 조건 필터링
// 급여 4000 이상 직원 중 최고 급여 직원을 찾으세요.
abstract class Employee24 {
    String name;
    int salary;

    Employee24(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer24 extends Employee24 {
    String language;

    Developer24(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer24 extends Employee24 {
    String tool;

    Designer24(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day09_Problem24 {
    public static void main(String[] args) {
        Employee24[] employee24s = {
                new Developer24("김개발", 4000, "Java"),
                new Designer24("이디자인", 3500, "Figma"),
                new Developer24("박개발", 5000, "Spring"),
                new Designer24("최디자인", 4200, "Photoshop"),
                new Developer24("정개발", 4500, "Python"),
                new Designer24("한디자인", 3800, "Illustrator")
        };
        Employee24 topSalary = null;
        for (Employee24 employee24 : employee24s) {
            employee24.work();
            if (employee24.salary >= 4000) {
                if (topSalary == null || employee24.salary > topSalary.salary) {
                    topSalary = employee24;
                }
            }
        }
        String occupation = null;
        if (topSalary instanceof Developer24) {
            occupation = "개발자";
        }
        if (topSalary instanceof Designer24) {
            occupation = "디자이너";
        }
        System.out.println();
        System.out.println("최고 급여 직원 : " + topSalary.name);
        System.out.println("직군 : " + occupation);
        System.out.println("급여 : " + topSalary.salary);
    }
}
