package chapter09;

// 로컬 변수 사용
// Calculator04 클래스의 calculate() 메서드에서 로컬 클래스가 지역변수를 사용하여 계산 결과 출력하기
class Calculator04 {
    void calculate() {
        int number = 10;
        class LocalCalculator04 {
            void showResult() {
                System.out.println("숫자 : " + number);
                System.out.println("결과 : " + (number * 2));
            }
        }
        LocalCalculator04 localCalculator04 = new LocalCalculator04();
        localCalculator04.showResult();
    }
}

public class Day12_Problem04 {
    public static void main(String[] args) {
        Calculator04 calculator04 = new Calculator04();

        calculator04.calculate();
    }
}
