package chapter07;
// 다형성 + 조건 필터링 + 최고값 찾기
// 직원 배열에서 개발자만 대상으로 최고 급여 개발자를 찾으세요.
abstract class Employee21 {
    String name;
    int salary;

    Employee21(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
}

class Developer21 extends Employee21 {
    String language;

    Developer21(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println("개발자는 " + language + "로 개발합니다.");
    }
}

class Designer21 extends Employee21 {
    String tool;

    Designer21(String name, int salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println("디자이너는 " + tool + "을 사용합니다.");
    }
}
public class Day09_Problem21 {
    public static void main(String[] args) {
        Employee21[] employee21s = {
                new Developer21("김개발", 4000, "Java"),
                new Designer21("이디자인", 3500, "Figma"),
                new Developer21("박개발", 5000, "Spring"),
                new Designer21("최디자인", 3200, "Photoshop"),
                new Developer21("정개발", 4500, "Python")
        };
        Employee21 topSalary=employee21s[0];
        for(Employee21 employee21:employee21s){
            if(employee21 instanceof Developer21){
                employee21=topSalary;
                break;
            }
        }
        for(Employee21 employee21:employee21s){
            employee21.work();
            if(employee21 instanceof Developer21){
                if(employee21.salary>topSalary.salary){
                    topSalary=employee21;
                }
            }
        }
        Developer21 topDev =(Developer21)topSalary;
        System.out.println();
        System.out.println("최고 급여 개발자 : "+topDev.name);
        System.out.println("급여 : "+topDev.salary);
        System.out.println("사용 언어 : "+topDev.language);
    }
}
