package chapter03;

public class Day01_Problem01 {
    public static void main(String[] args) {
        int money=135760;
        int bill50000=135760/50000;
        int bill10000=135760%50000/10000;
        int bill5000=135760%10000/5000;
        int bill1000=135760%5000/1000;
        int bill500=135760%1000/500;
        int bill100=135760%500/100;
        int bill50=135760%100/50;
        int bill10=135760%50/10;
        System.out.println("금액 : "+135760+"원");
        System.out.println();
        System.out.println("50000원 : "+bill50000+"장");
        System.out.println("10000원 : "+bill10000+"장");
        System.out.println("5000원 : "+bill5000+"장");
        System.out.println("1000원 : "+bill1000+"장");
        System.out.println("500원 : "+bill500+"개");
        System.out.println("100원 : "+bill100+"개");
        System.out.println("50원 : "+bill50+"개");
        System.out.println("10원 : "+bill10+"개");
    }
}
