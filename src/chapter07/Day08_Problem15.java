package chapter07;

// 다형성 + 다운캐스팅 + 합계 계산
// 직원 배열에서 급여 총합과 개발자 수를 구하세요.
abstract class Employee15 {
    String name;
    int salary;

    Employee15(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer15 extends Employee15 {
    String language;

    Developer15(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer15 extends Employee15 {
    String tool;

    Designer15(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day08_Problem15 {
    public static void main(String[] args) {
        Employee15[] employee15s = {
                new Developer15("김개발", 4000, "Java"),
                new Designer15("이디자인", 3500, "Figma"),
                new Developer15("박개발", 4500, "Spring"),
                new Designer15("최디자인", 3200, "Photoshop")
        };
        int devCount = 0;
        int sumSalary = 0;
        for (Employee15 employee15 : employee15s) {
            sumSalary += employee15.salary;
            employee15.work();
            if (employee15 instanceof Developer15) {
                devCount++;
            }
        }
        System.out.println();
        System.out.println("전체 급여 합계 : " + sumSalary);
        System.out.println("개발자 수 : " + devCount);
    }
}
