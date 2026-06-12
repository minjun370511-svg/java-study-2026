package chapter07;

// 다형성 + 조건 필터링 + 타입별 출력
// 직원 배열에서 급여가 4000 이상인 직원만 출력하고, 그중 개발자 수를 구하세요.
abstract class Employee23 {
    String name;
    int salary;

    Employee23(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer23 extends Employee23 {
    String language;

    Developer23(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer23 extends Employee23 {
    String tool;

    Designer23(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day09_Problem23 {
    public static void main(String[] args) {
        Employee23[] employee23s = {
                new Developer23("김개발", 4000, "Java"),
                new Designer23("이디자인", 3500, "Figma"),
                new Developer23("박개발", 5000, "Spring"),
                new Designer23("최디자인", 4200, "Photoshop"),
                new Developer23("정개발", 4500, "Python"),
                new Designer23("한디자인", 3800, "Illustrator")
        };
        int countDev = 0;
        int sum = 0;
        for (Employee23 employee23 : employee23s) {
            employee23.work();
        }
        System.out.println();
        System.out.println("급여 4000 이상 직원");
        for (Employee23 employee23 : employee23s) {
            if (employee23.salary >= 4000) {
                sum += employee23.salary;
                System.out.println(employee23.name + " : " + employee23.salary);
                if (employee23 instanceof Developer23) {
                    countDev++;
                }
            }
        }
        System.out.println();
        System.out.println("4000 이상 직원 중 개발자 수 : " + countDev);
        System.out.println("4000 이상 직원 급여 합계 : " + sum);

    }
}
