package chapter10.app;
// 패키지 은닉 이해하기
// 같은 패키지와 다른 패키지에서 클래스 접근 가능 여부 확인하기
import chapter10.hidden.Secret;

public class Day13_Problem01 {
    public static void main(String[] args) {
        Secret secret = new Secret();
        secret.print();
    }
}
