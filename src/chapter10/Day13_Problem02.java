package chapter10;

// exports 이해하기
// exports 유무에 따른 패키지 공개 여부 확인하기

public class Day13_Problem02 {

    public static void main(String[] args) {

        // public 클래스라고 해서 다른 모듈에서 바로 사용할 수 있는 것은 아니다.
        // exports로 패키지를 공개해야 다른 모듈에서 접근할 수 있다.

        System.out.println("exports는 패키지를 외부 모듈에 공개한다.");
    }
}