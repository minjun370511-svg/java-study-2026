package chapter07;

// 다형성 + 타입별 통계
// 직원 배열에서 개발자와 디자이너의 인원 수와 평균 급여를 각각 구하세요.
abstract class Employee20 {
    String name;
    int salary;

    Employee20(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer20 extends Employee20 {
    String language;

    Developer20(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer20 extends Employee20 {
    String tool;

    Designer20(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}

public class Day09_Problem20 {
    public static void main(String[] args) {
        Employee20[] employee20s = {
                new Developer20("김개발", 4000, "Java"),
                new Designer20("이디자인", 3500, "Figma"),
                new Developer20("박개발", 5000, "Spring"),
                new Designer20("최디자인", 3200, "Photoshop"),
                new Developer20("정개발", 4500, "Python")
        };
        int devCount = 0;
        int desCount = 0;
        int sumDev = 0;
        int sumDes = 0;
        for (Employee20 employee20 : employee20s) {
            employee20.work();
            if (employee20 instanceof Developer20) {
                devCount++;
                sumDev += employee20.salary;
            }
            if (employee20 instanceof Designer20) {
                desCount++;
                sumDes += employee20.salary;
            }
        }
        double devAvg = (double) sumDev / devCount;
        double desAvg = (double) sumDes / desCount;
        System.out.println();
        System.out.println("개발자 수 : " + devCount);
        System.out.println("개발자 평균 급여 : " + devAvg);
        System.out.println("디자이너 수 : " + desCount);
        System.out.println("디자이너 평균 급여 : " + desAvg);


    }
}
