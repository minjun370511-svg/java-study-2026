package chapter02;

public class Day01_Problem06 {
    public static void main(String[] args) {
        int money = 876000;
        int bill50000 = money / 50000;
        int bill10000 = money % 50000 / 10000;
        int c = money % 50000 % 10000 / 5000;
        int d = money % 5000 / 1000;
        System.out.println("50000원 : " + bill50000 + "장");
        System.out.println("10000원 : " + bill10000 + "장");
        System.out.println("5000원 : " + c + "장");
        System.out.println("1000원 : " + d + "장");

    }
}
