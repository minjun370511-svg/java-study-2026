package chapter10;

// requires 이해하기
// 다른 모듈을 사용하기 위해 requires가 필요한 이유 이해하기

public class Day13_Problem03 {

    public static void main(String[] args) {

        // exports는 패키지를 공개하는 것이다.
        // requires는 공개된 모듈을 사용하겠다고 선언하는 것이다.
        // exports만 있고 requires가 없으면 다른 모듈을 사용할 수 없다.

        System.out.println("requires는 다른 모듈을 사용하기 위한 선언이다.");
    }

}
