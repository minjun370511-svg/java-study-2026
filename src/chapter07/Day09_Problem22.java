package chapter07;

// 다형성 + 그룹별 최고값 찾기
// 개발자와 디자이너 각각 최고 급여 직원을 찾으세요.
abstract class Employee22 {
    String name;
    int salary;

    Employee22(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer22 extends Employee22 {
    String language;

    Developer22(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer22 extends Employee22 {
    String tool;

    Designer22(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day09_Problem22 {
    public static void main(String[] args) {
        Employee22[] employee22s = {
                new Developer22("김개발", 4000, "Java"),
                new Designer22("이디자인", 3500, "Figma"),
                new Developer22("박개발", 5000, "Spring"),
                new Designer22("최디자인", 4200, "Photoshop"),
                new Developer22("정개발", 4500, "Python"),
                new Designer22("한디자인", 3800, "Illustrator")
        };
        Employee22 topDev = employee22s[0];
        Employee22 topDes = employee22s[0];
        for (Employee22 employee22 : employee22s) {
            if (employee22 instanceof Developer22) {
                topDev = employee22;
            }
            if (employee22 instanceof Designer22) {
                topDes = employee22;
            }
        }
        for (Employee22 employee22 : employee22s) {
            employee22.work();
            if (employee22 instanceof Developer22) {
                if (employee22.salary > topDev.salary) {
                    topDev = employee22;
                }
            }
            if (employee22 instanceof Designer22) {
                if (employee22.salary > topDes.salary) {
                    topDes = employee22;
                }
            }
        }
        System.out.println();
        System.out.println("최고 급여 개발자 : " + topDev.name);
        System.out.println("급여 : " + topDev.salary);
        System.out.println();
        System.out.println("최고 급여 디자이너 : " + topDes.name);
        System.out.println("급여 : " + topDes.salary);
    }
}
