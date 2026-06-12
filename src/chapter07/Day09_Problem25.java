package chapter07;

// Chapter07 최종 종합
// 직원 배열에서 직군별 평균 급여, 최고 급여 직원, 4000 이상 직원 수를 모두 구하세요.
abstract class Employee25 {
    String name;
    int salary;

    Employee25(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer25 extends Employee25 {
    String language;

    Developer25(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer25 extends Employee25 {
    String tool;

    Designer25(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

class Manager25 extends Employee25 {
    String department;

    Manager25(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println("매니저는 " + department + "팀을 관리합니다.");
    }
}

public class Day09_Problem25 {
    public static void main(String[] args) {
        Employee25[] employee25s = {
                new Developer25("김개발", 4000, "Java"),
                new Designer25("이디자인", 3500, "Figma"),
                new Manager25("박매니저", 5500, "AI팀"),
                new Developer25("최개발", 5000, "Spring"),
                new Designer25("한디자인", 4200, "Photoshop"),
                new Manager25("정매니저", 4800, "개발팀"),
                new Developer25("오개발", 4500, "Python")
        };
        int devSum = 0;
        int desSum = 0;
        int manSum = 0;
        int devCount = 0;
        int desCount = 0;
        int manCount = 0;
        Employee25 topSalary = employee25s[0];
        int count4000 = 0;
        for (Employee25 employee25 : employee25s) {
            employee25.work();
            if (employee25.salary > topSalary.salary) {
                topSalary = employee25;
            }
            if (employee25 instanceof Developer25) {
                devSum += employee25.salary;
                devCount++;
            }
            if (employee25 instanceof Designer25) {
                desSum += employee25.salary;
                desCount++;
            }
            if (employee25 instanceof Manager25) {
                manSum += employee25.salary;
                manCount++;
            }
            if (employee25.salary >= 4000) {
                count4000++;
            }
        }
        String occupation = null;
        if (topSalary instanceof Developer25) {
            occupation = "개발자";
        }
        if (topSalary instanceof Designer25) {
            occupation = "디자이너";
        }
        if (topSalary instanceof Manager25) {
            occupation = "매니저";
        }
        double devAvg = (double) devSum / devCount;
        double desAvg = (double) desSum / desCount;
        double manAvg = (double) manSum / manCount;
        System.out.println();
        System.out.println("개발자 평균 급여 : " + devAvg);
        System.out.println("디자이너 평균 급여 : " + desAvg);
        System.out.println("매니저 평균 급여 : " + manAvg);
        System.out.println();
        System.out.println("4000 이상 직원 수 : " + count4000);
        System.out.println();
        System.out.println("최고 급여 직원 : " + topSalary.name);
        System.out.println("직군 : " + occupation);
        System.out.println("급여 : " + topSalary.salary);
    }
}
