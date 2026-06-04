package chapter03;

public class Day01_Problem04 {
    public static void main(String[] args) {
        int age = 22;
        boolean hasId = true;
        System.out.println("나이 :" + age);
        System.out.println("신분증 소지 :" + hasId);
        System.out.println("입장 가능 :" + ((age > 20) && hasId));
    }
}
